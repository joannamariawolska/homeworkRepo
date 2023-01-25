package lesson7task5;

import java.time.Month;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

class SeasonUtils {

    public static Season printSeason(Month month) {
        if(month == null) {
            throw new IllegalArgumentException("aaaa");
        }else{
            switch (month) {
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
            }
        }
        return null;
    }
}