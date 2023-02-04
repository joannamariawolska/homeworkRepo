package lesson7task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;
import static org.junit.jupiter.api.Assertions.*;

class SeasonUtilsTest {

    @Test
    void shouldThrowIllegalArgumentExceptionWithCorrectMessage() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->  {
            SeasonUtils.printSeason(null);
        });
        Assertions.assertEquals("Month cannot be null", exception.getMessage());
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldIndicateWinter(Month month) {
        Assertions.assertEquals(Season.WINTER, SeasonUtils.printSeason(month));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"MARCH", "APRIL", "MAY"})
    void shouldIndicateSpring(Month month) {
        Assertions.assertEquals(Season.SPRING, SeasonUtils.printSeason(month));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JUNE", "JULY", "AUGUST"})
    void shouldIndicateSummer(Month month) {
        Assertions.assertEquals(Season.SUMMER, SeasonUtils.printSeason(month));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldIndicateAutumn(Month month) {
        Assertions.assertEquals(Season.AUTUMN, SeasonUtils.printSeason(month));
    }
}