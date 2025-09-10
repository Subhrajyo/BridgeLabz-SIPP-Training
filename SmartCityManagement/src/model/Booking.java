package model;

import java.time.LocalDateTime;

public class Booking {
    private final Passenger passenger;
    private final String route;
    private final LocalDateTime time;
    private final double fare;
    private final String serviceType;

    public Booking(Passenger passenger, String route, LocalDateTime time, double fare, String serviceType) {
        this.passenger = passenger;
        this.route = route;
        this.time = time;
        this.fare = fare;
        this.serviceType = serviceType;
    }

    public Passenger getPassenger() { return passenger; }
    public String getRoute() { return route; }
    public LocalDateTime getTime() { return time; }
    public double getFare() { return fare; }
    public String getServiceType() { return serviceType; }

    public boolean isPeak() {
        int h = time.getHour();
        return (h >= 7 && h <= 10) || (h >= 17 && h <= 20);
    }

    @Override
    public String toString() {
        return String.format("[%s %s %s $%.2f %s]",
                passenger, route, time.toLocalTime(), fare, serviceType);
    }
}
