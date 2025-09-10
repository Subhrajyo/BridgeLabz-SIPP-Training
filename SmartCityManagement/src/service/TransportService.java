package service;

import model.Booking;
import java.util.List;
import java.util.stream.Stream;

public interface TransportService {
    String serviceName();
    List<Booking> activeBookings();

    default void printServiceDetails() {
        System.out.println("Service: " + serviceName() + " | Active bookings: " + activeBookings().size());
    }

    default Stream<Booking> streamBookings() {
        return activeBookings().stream();
    }
}
