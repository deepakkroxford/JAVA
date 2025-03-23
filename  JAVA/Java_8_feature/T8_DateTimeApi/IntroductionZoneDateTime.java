package Java_8_feature.T8_DateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class IntroductionZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current date and time with time zone: " + now);
        System.out.println("Current time zone: " + now.getZone()); // it will get the current time zone like Asia/Kolkata
        System.out.println("Current date and time in UTC: " + now.withZoneSameInstant(java.time.ZoneOffset.UTC));
        System.out.println("Current date: " + now.toLocalDate());
        System.out.println("Year: " + now.getYear());

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(i -> System.out.println(i));
        System.out.println("Total available zone IDs: " + availableZoneIds.size());

        // Finding and using a specific time zone
        ZoneId specificZoneId = ZoneId.of("America/New_York");
        ZonedDateTime specificZoneDateTime = ZonedDateTime.now(specificZoneId);
        System.out.println("Current date and time in America/New_York: " + specificZoneDateTime);

        // Demonstrating additional methods
        ZonedDateTime futureDateTime = now.plusDays(5).plusHours(3);
        System.out.println("Future date-time (5 days and 3 hours later): " + futureDateTime);

        ZonedDateTime pastDateTime = now.minusDays(5).minusHours(3);
        System.out.println("Past date-time (5 days and 3 hours earlier): " + pastDateTime);

        System.out.println("Converted to LocalDateTime: " + now.toLocalDateTime());
        System.out.println("Converted to LocalDate: " + now.toLocalDate());
        System.out.println("Converted to LocalTime: " + now.toLocalTime());

        ZonedDateTime anotherDateTime = ZonedDateTime.of(2025, 12, 25, 10, 30, 0, 0, now.getZone());
        System.out.println("Is current date-time before 2025-12-25T10:30? " + now.isBefore(anotherDateTime));
        System.out.println("Is current date-time after 2025-12-25T10:30? " + now.isAfter(anotherDateTime));
    }
}
