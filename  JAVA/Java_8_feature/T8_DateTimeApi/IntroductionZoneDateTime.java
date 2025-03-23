package Java_8_feature.T8_DateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class IntroductionZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current date and time with time zone: " + now);
        System.out.println("Current time zone: " + now.getZone()); // it will get the current time zone like Asia/Kolkata
        System.out.println("Current date and time in UTC: " + now.withZoneSameInstant(java.time.ZoneOffset.UTC));
        System.out.println("Current date: " + now.toLocalDate());
        System.out.println("Year: " + now.getYear());

        Set<String> availableZoneIds =ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(i->System.out.println(i));
        System.out.println(availableZoneIds.size());
        //System.out.println(availableZoneIds);
    }
    
}
