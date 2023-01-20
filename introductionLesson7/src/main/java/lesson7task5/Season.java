package lesson7task5;

import java.time.Month;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

class SeasonUtils {
    public static Season getSeason(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Błąd");
        }
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return Season.WINTER;
        } else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY) {
            return Season.SPRING;
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return Season.SUMMER;
        } else {
            return Season.AUTUMN;
        }
    }
}