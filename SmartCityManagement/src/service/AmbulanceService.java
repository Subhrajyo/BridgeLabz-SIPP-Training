package service;

import model.Booking;
import java.util.List;

public class AmbulanceService implements TransportService, EmergencyService {
    private final List<Booking> bookings;
    private final String name;

    public AmbulanceService(String name, List<Booking> bookings) {
        this.name = name;
        this.bookings = bookings;
    }

    @Override
    public String serviceName() { return "Ambulance-" + name; }

    @Override
    public List<Booking> activeBookings() { return bookings; }

    @Override
    public void printServiceDetails() {
        System.out.println("[EMERGENCY] " + serviceName() + " | Active: " + activeBookings().size());
    }
}
