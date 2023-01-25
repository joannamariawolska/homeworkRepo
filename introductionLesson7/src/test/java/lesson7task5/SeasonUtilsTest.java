package lesson7task5;

import org.junit.jupiter.api.Test;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.*;

class SeasonUtilsTest {

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->  {
            SeasonUtils.printSeason(null);
        });
    }

    @Test
    void shouldIndicateWinterForDecember() {
        assertEquals(Season.WINTER, SeasonUtils.printSeason(Month.DECEMBER));
    }

    @Test
    void shouldIndicateWinterForJanuary() {
        assertEquals(Season.WINTER, SeasonUtils.printSeason(Month.JANUARY));
    }

    @Test
    void shouldIndicateWinterForFebruary() {
        assertEquals(Season.WINTER, SeasonUtils.printSeason(Month.FEBRUARY));
    }

    @Test
    void shouldIndicateSpringForMarch() {
        assertEquals(Season.SPRING, SeasonUtils.printSeason(Month.MARCH));
    }

    @Test
    void shouldIndicateSpringForApril() {
        assertEquals(Season.SPRING, SeasonUtils.printSeason(Month.APRIL));
    }

    @Test
    void shouldIndicateSpringForMay() {
        assertEquals(Season.SPRING, SeasonUtils.printSeason(Month.MAY));
    }

    @Test
    void shouldIndicateSummerForJune() {
        assertEquals(Season.SUMMER, SeasonUtils.printSeason(Month.JUNE));
    }

    @Test
    void shouldIndicateSummerForJuly() {
        assertEquals(Season.SUMMER, SeasonUtils.printSeason(Month.JULY));
    }

    @Test
    void shouldIndicateSummerForAugust() {
        assertEquals(Season.SUMMER, SeasonUtils.printSeason(Month.AUGUST));
    }

    @Test
    void shouldIndicateAutumnForSeptember() {
        assertEquals(Season.AUTUMN, SeasonUtils.printSeason(Month.SEPTEMBER));
    }

    @Test
    void shouldIndicateAutumnForOctober() {
        assertEquals(Season.AUTUMN, SeasonUtils.printSeason(Month.OCTOBER));
    }

    @Test
    void shouldIndicateAutumnForNovember() {
        assertEquals(Season.AUTUMN, SeasonUtils.printSeason(Month.NOVEMBER));
    }
}