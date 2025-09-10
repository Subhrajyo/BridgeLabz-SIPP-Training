package service;

import model.Booking;
import java.util.List;

public class MetroService implements TransportService {
    private final List<Booking> bookings;
    private final String name;

    public MetroService(String name, List<Booking> bookings) {
        this.name = name;
        this.bookings = bookings;
    }

    @Override
    public String serviceName() { return "Metro-" + name; }

    @Override
    public List<Booking> activeBookings() { return bookings; }
}
