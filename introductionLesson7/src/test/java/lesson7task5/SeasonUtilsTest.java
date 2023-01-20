package lesson7task5;

import org.junit.jupiter.api.Test;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.*;

class SeasonUtilsTest {

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->  {
            SeasonUtils.getSeason(null);
        });
    }

    @Test
    void shouldIndicateWinter() {
        assertEquals(Season.WINTER, SeasonUtils.getSeason(Month.DECEMBER));
        assertEquals(Season.WINTER, SeasonUtils.getSeason(Month.JANUARY));
        assertEquals(Season.WINTER, SeasonUtils.getSeason(Month.FEBRUARY));
    }

    @Test
    void shouldIndicateSpring() {
        assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.MARCH));
        assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.APRIL));
        assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.MAY));
    }

    @Test
    void shouldIndicateSummer() {
        assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.JUNE));
        assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.JULY));
        assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.AUGUST));
    }

    @Test
    void shouldIndicateAutumn() {
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.SEPTEMBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.OCTOBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.NOVEMBER));
    }
}