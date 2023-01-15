package lesson7task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static lesson7task2.TextUpperCaseFormatter.getUpperCase;

class TextUpperCaseFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"ala", "dom", "słuchawki", "zeszyt"})
    void shouldChangeTextToUpperCase(String input) {
        String actualValue = input.toUpperCase();
        Assertions.assertEquals(getUpperCase(input), actualValue);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldChangeTextToUpperCase2(String input) {
        Assertions.assertTrue(input == null || input.isEmpty());
    }
}