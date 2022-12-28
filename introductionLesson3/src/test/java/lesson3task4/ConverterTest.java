package lesson3task4;

import org.junit.jupiter.api.Assertions;

class ConverterTest {

    @org.junit.jupiter.api.Test
    void shouldConvertMinutesToSeconds() {
        int seconds = Converter.minutesToSeconds(5);
        Assertions.assertEquals(300, seconds);
    }
}