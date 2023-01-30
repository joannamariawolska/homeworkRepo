package lesson7task5;

import java.time.Month;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

class SeasonUtils {

    public static String printSeason(Month month) {
        if(month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }else switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER.name();
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING.name();
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER.name();
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.AUTUMN.name();
            default:
                return "There is no such a month";
        }
    }
}