package service;

import model.Booking;
import java.util.List;

public class TaxiService implements TransportService {
    private final List<Booking> bookings;
    private final String name;

    public TaxiService(String name, List<Booking> bookings) {
        this.name = name;
        this.bookings = bookings;
    }

    @Override
    public String serviceName() { return "Taxi-" + name; }

    @Override
    public List<Booking> activeBookings() { return bookings; }
}
