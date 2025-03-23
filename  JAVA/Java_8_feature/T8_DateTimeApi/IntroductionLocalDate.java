package Java_8_feature.T8_DateTimeApi;

import java.time.LocalDate;

public class IntroductionLocalDate {
    public static void main(String[] args) {
        
        // Local DateTime 
        LocalDate loc  =  LocalDate.now();
        System.out.println("It will print the year-month-date format: "+loc);
        System.out.println("it will print the current year: "+loc.getYear());// it will get the current year
        System.out.println("it will print the current month of the year:  "+loc.getMonth()); // it will return the month of the year like January
        System.out.println("it will print the current date of the month: "+loc.getDayOfMonth()); // it will return the day of the month
        System.out.println("it will give the current count of the day in the year: "+loc.getDayOfYear()); // it will return the day of the year like 83 days or whatever
        System.out.println("the value of the month is: "+loc.getMonthValue()); // it will return the month of the year like 1 for January
        System.out.println("it will print the value 10 days after the current date: "+loc.plusDays(10)); // it will return the 10 days from the current day
        System.out.println("it will reduce the given date from the current date: "+loc.minusDays(10)); // it will return the 10 days before the current day
        System.out.println("it will print the past value that is provide from now  in year-month-days: "+loc.minusMonths(6)); // it will subtract the 6 months from the current date
        System.out.println("it will print the past value that is provide from now  in year-month-days: "+loc.minusYears(2)); // it will subtract the 2 years from the current date
        System.out.println("it will print the past value that is provide from now  in year-month-days: "+loc.minusWeeks(2)); // it will subtract the 2 weeks from the current date

    }
}
