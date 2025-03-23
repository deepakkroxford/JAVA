package Java_8_feature.T8_DateTimeApi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class IntroductionInstance {
    public static void main(String[] args) {
        // Creation methods
        Instant now = Instant.now();
        System.out.println("Current instant: " + now);

        Instant epochSecond = Instant.ofEpochSecond(1609459200); // 2021-01-01T00:00:00Z
        System.out.println("Instant from epoch second: " + epochSecond);

        Instant epochMilli = Instant.ofEpochMilli(1609459200000L); // 2021-01-01T00:00:00Z
        System.out.println("Instant from epoch milli: " + epochMilli);

        Instant parsedInstant = Instant.parse("2025-03-23T10:15:30.00Z");
        System.out.println("Parsed instant: " + parsedInstant);

        // Manipulation methods
        Instant futureInstant = now.plusSeconds(3600); // 1 hour later
        System.out.println("Future instant (1 hour later): " + futureInstant);

        Instant pastInstant = now.minusSeconds(3600); // 1 hour earlier
        System.out.println("Past instant (1 hour earlier): " + pastInstant);

        // Conversion methods
        long epochMilliValue = now.toEpochMilli();
        System.out.println("Epoch milli value: " + epochMilliValue);

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("America/New_York"));
        System.out.println("ZonedDateTime in America/New_York: " + zonedDateTime);

        // Comparison methods
        boolean isBefore = now.isBefore(futureInstant);
        System.out.println("Is now before future instant? " + isBefore);

        boolean isAfter = now.isAfter(pastInstant);
        System.out.println("Is now after past instant? " + isAfter);
    }
}
