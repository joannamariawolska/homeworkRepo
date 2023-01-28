package lesson10task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PeselValidatorTest {

    @ParameterizedTest
    @MethodSource("provideCorrectPeselNumber")
    void shouldTrueWhenValueHas11Digits(String pesel) {
        boolean isPesel = PeselValidator.checkPesel(pesel);
        assertTrue(isPesel);
    }


    @ParameterizedTest
    @MethodSource("provideNotCorrectPeselNumberWithWrongLength")
    void shouldReturnFalseWhenPeselLengthIsNotCorrect(String pesel) {
        boolean isPesel = PeselValidator.checkPesel(pesel);
        assertFalse(isPesel);
    }

    @ParameterizedTest
    @MethodSource("provideNotCorrectPeselNumberWithOtherCharacters")
    void shouldReturnFalseWhenPeselLengthCorrectButHasOtherCharacters(String pesel) {
        boolean isPesel = PeselValidator.checkPesel(pesel);
        assertFalse(isPesel);
    }


    private static Stream<Arguments> provideCorrectPeselNumber() {
        return Stream.of(
                Arguments.of("12345678910"),
                Arguments.of("10987654321"));
    }

    private static Stream<Arguments> provideNotCorrectPeselNumberWithWrongLength() {
        return Stream.of(
                Arguments.of("1234567891011"),
                Arguments.of("10987654"));
    }

    private static Stream<Arguments> provideNotCorrectPeselNumberWithOtherCharacters() {
        return Stream.of(
                Arguments.of("12E45G78910"),
                Arguments.of("1O987b5432I"));
    }
}