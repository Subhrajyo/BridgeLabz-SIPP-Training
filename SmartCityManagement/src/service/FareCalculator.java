package service;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(String route, double baseFare, double distanceKm);
}
