package Java_8_feature.T8_DateTimeApi;

import java.time.LocalDateTime;

public class IntroductionLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime loc = LocalDateTime.now();
        System.out.println("It will print the year-month-date-hour-minute-second format: " + loc);
        System.out.println("it will print the current year: " + loc.getYear()); // it will get the current year
        System.out.println("it will print the current month: " + loc.getMonth()); // it will return the month of the year like January
        System.out.println("it will print the current date of the month: " + loc.getDayOfMonth()); // it will return the day of the month
        System.out.println("it will give the current count of the day in the year: " + loc.getDayOfYear()); // it will return the day of the year like 83 days or whatever
        System.out.println("the value of the month is: " + loc.getMonthValue()); // it will return the month of the year like 1 for January

        // Additional time methods
        System.out.println("it will print the current hour: " + loc.getHour()); // it will return the current hour
        System.out.println("it will print the current minute: " + loc.getMinute()); // it will return the current minute
        System.out.println("it will print the current second: " + loc.getSecond()); // it will return the current second
        System.out.println("it will print the current nanosecond: " + loc.getNano()); // it will return the current nanosecond

        // Demonstrating additional methods
        LocalDateTime futureDateTime = loc.plusDays(5).plusHours(3);
        System.out.println("Future date-time (5 days and 3 hours later): " + futureDateTime);

        LocalDateTime pastDateTime = loc.minusDays(5).minusHours(3);
        System.out.println("Past date-time (5 days and 3 hours earlier): " + pastDateTime);

        System.out.println("Converted to LocalDate: " + loc.toLocalDate());
        System.out.println("Converted to LocalTime: " + loc.toLocalTime());

        LocalDateTime anotherDateTime = LocalDateTime.of(2025, 12, 25, 10, 30);
        System.out.println("Is current date-time before 2025-12-25T10:30? " + loc.isBefore(anotherDateTime));
        System.out.println("Is current date-time after 2025-12-25T10:30? " + loc.isAfter(anotherDateTime));
    }
}
