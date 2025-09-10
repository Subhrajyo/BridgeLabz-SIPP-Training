package service;

import model.Booking;
import java.util.List;

public class FerryService implements TransportService {
    private final List<Booking> bookings;
    private final String name;

    public FerryService(String name, List<Booking> bookings) {
        this.name = name;
        this.bookings = bookings;
    }

    @Override
    public String serviceName() { return "Ferry-" + name; }

    @Override
    public List<Booking> activeBookings() { return bookings; }
}
