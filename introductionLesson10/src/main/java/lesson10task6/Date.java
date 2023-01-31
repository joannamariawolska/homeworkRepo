package lesson10task6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class Date {

    public static int getAge(LocalDate dateOfBirth) {
        LocalDate now = LocalDate.now();
        Period age = Period.between(dateOfBirth, now);
        return age.getYears();
    }

    public static DayOfWeek getDayOfWeek(LocalDate dateOfBirth) {
        return dateOfBirth.getDayOfWeek();
    }

    public static int getWeekOfYear(LocalDate dateOfBirth) {
        return dateOfBirth.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
    }

    public static void main(String[] args) {
        System.out.println(getAge(LocalDate.of(1997, 1, 21)));
        System.out.println(getDayOfWeek(LocalDate.of(1997, 1, 21)));
        System.out.println(getWeekOfYear(LocalDate.of(1997, 1, 21)));
    }
}