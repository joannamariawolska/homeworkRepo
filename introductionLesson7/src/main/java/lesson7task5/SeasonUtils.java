package lesson7task5;

import java.time.Month;

class SeasonUtils {

    public static Season printSeason(Month month) {
        if(month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }else switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.AUTUMN;
            default:
                return Season.valueOf("There is no such a month");
        }
    }
}