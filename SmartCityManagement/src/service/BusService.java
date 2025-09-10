package service;

import model.Booking;
import java.util.List;

public class BusService implements TransportService {
    private final List<Booking> bookings;
    private final String name;

    public BusService(String name, List<Booking> bookings) {
        this.name = name;
        this.bookings = bookings;
    }

    @Override
    public String serviceName() { return "Bus-" + name; }

    @Override
    public List<Booking> activeBookings() { return bookings; }
}
