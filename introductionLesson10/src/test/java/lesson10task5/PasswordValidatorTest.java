package lesson10task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class PasswordValidatorTest {

    @ParameterizedTest
    @MethodSource("provideCorrectPassword")
    void shouldBeTrueForCorrectPassword(String password) {
        boolean isCorrect = PasswordValidator.isCorrectPassword(password);
        Assertions.assertTrue(isCorrect);
    }

    @ParameterizedTest
    @MethodSource("provideNotCorrectPassword")
    void shouldBeFalseForNotCorrectPassword(String password) {
        boolean isCorrect = PasswordValidator.isCorrectPassword(password);
        Assertions.assertFalse(isCorrect);
    }

    private static Stream<Arguments> provideCorrectPassword() {
        return Stream.of(
                Arguments.of("BardzoDobreHasło987"),
                Arguments.of("Hasełko33"));
    }

    private static Stream<Arguments> provideNotCorrectPassword() {
        return Stream.of(
                Arguments.of("bardzozłehasło"),
                Arguments.of("Hasełko2021"));
    }
}