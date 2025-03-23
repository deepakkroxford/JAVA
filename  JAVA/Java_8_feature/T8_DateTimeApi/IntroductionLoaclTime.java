package Java_8_feature.T8_DateTimeApi;

import java.time.LocalTime;

public class IntroductionLoaclTime {
    public static void main(String[] args) {
        // Local Time
        LocalTime loc = LocalTime.now();
        System.out.println("It will print the hour-minute-second format: " + loc);
        System.out.println("it will print the current hour: " + loc.getHour()); // it will get the current hour
        System.out.println("it will print the current minute of the hour:  " + loc.getMinute()); // it will return the minute of the hour
        System.out.println("it will print the current second of the minute: " + loc.getSecond()); // it will return the second of the minute
        System.out.println("it will give the current count of the nanosecond in the second: " + loc.getNano()); // it will return the nanosecond of the second
        System.out.println("the value of the hour is: " + loc.getHour()); // it will return the hour of the day like 1 for January
        System.out.println("it will print the value 10 hours after the current time: " + loc.plusHours(10)); // it will return the 10 hours from the current time
        System.out.println("it will reduce the given time from the current time: " + loc.minusHours(10)); // it will return the 10 hours before the current time
        System.out.println("it will print the past value that is provide from now  in hour-minute-seconds: " + loc.minusMinutes(6)); // it will subtract the 6 minutes from the current time
        System.out.println("it will print the past value that is provide from now  in hour-minute-seconds: " + loc.minusSeconds(2)); // it will subtract the 2 seconds from the current time
        System.out.println("it will print the past value that is provide from now  in hour-minute-seconds: " + loc.minusNanos(2)); // it will subtract the 2 nanoseconds from the current time
        System.out.println("it will print the past value that is provide from now  in hour-minute-seconds: " + loc.minusMinutes(2)); // it will subtract the 2 minutes from the current time
        System.out.println("it will print the past value that is provide from now  in hour-minute-seconds: " + loc.minusHours(2)); // it will subtract the 2 hours from the current time
    }
}
