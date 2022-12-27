package lesson2task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDaysTest {

    @Test
    void shouldBeOneOfWorkingDay() {
        String getDayOfWeek = WeekDays.getDayOfWeek(1);
        Assertions.assertEquals("Monday", getDayOfWeek);
    }

    @Test
    void shouldBeWeekendDay() {
        String getDayOfWeek = WeekDays.getDayOfWeek(6);
        Assertions.assertEquals("Weekend", getDayOfWeek);
    }

    @Test
    void shouldBeNoSuchDay() {
        String getDayOfWeek = WeekDays.getDayOfWeek(10);
        Assertions.assertEquals("There is no such a day", getDayOfWeek);
    }
}