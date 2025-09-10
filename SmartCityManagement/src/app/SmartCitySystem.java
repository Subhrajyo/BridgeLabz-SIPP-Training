package app;

import model.*;
import service.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class SmartCitySystem {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("P01", "Alice");
        Passenger p2 = new Passenger("P02", "Bob");
        Passenger p3 = new Passenger("P03", "Celia");
        Passenger p4 = new Passenger("P04", "Dan");

        LocalDateTime now = LocalDateTime.now();

        List<Booking> busBookings = Arrays.asList(
                new Booking(p1, "A->B", now.minusMinutes(30), 2.5, "Bus"),
                new Booking(p2, "A->B", now.minusHours(2), 2.5, "Bus"),
                new Booking(p3, "C->D", now.minusDays(1), 3.0, "Bus")
        );

        List<Booking> metroBookings = Arrays.asList(
                new Booking(p1, "A->B", now.plusMinutes(10), 1.8, "Metro"),
                new Booking(p1, "B->C", now.minusHours(5), 2.0, "Metro"),
                new Booking(p4, "E->F", now.minusHours(1), 2.5, "Metro")
        );

        List<Booking> taxiBookings = Arrays.asList(
                new Booking(p2, "Home->Station", now.minusMinutes(15), 12.0, "Taxi"),
                new Booking(p3, "Office->Home", now.minusDays(2), 9.5, "Taxi")
        );

        List<Booking> ambulanceBookings = Arrays.asList(
                new Booking(p4, "X->Hospital", now.minusMinutes(5), 0.0, "Ambulance")
        );

        List<TransportService> services = Arrays.asList(
                new BusService("B1", busBookings),
                new MetroService("M1", metroBookings),
                new TaxiService("T1", taxiBookings),
                new AmbulanceService("A1", ambulanceBookings),
                new FerryService("F1", Collections.emptyList())
        );

        List<Booking> allBookings = services.stream()
                .flatMap(TransportService::streamBookings)
                .collect(toList());

        System.out.println("\nAll bookings:");
        allBookings.forEach(System.out::println);

        Map<String, Long> bookingsByRoute = allBookings.stream()
                .collect(groupingBy(Booking::getRoute, counting()));
        System.out.println("\nBookings by route: " + bookingsByRoute);

        DoubleSummaryStatistics fareStats = allBookings.stream()
                .collect(summarizingDouble(Booking::getFare));
        System.out.println("\nFare Summary: " + fareStats);

        System.out.println("\nEmergency services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println("PRIORITIZE: " + s.serviceName()));

        FareCalculator calc = (route, base, distance) -> base + (distance * 0.5);
        double dist = GeoUtils.calculateDistance(12.97, 77.59, 12.93, 77.62);
        System.out.println("\nSample fare (A->B): " + calc.calculateFare("A->B", 1.0, dist));
    }
}
