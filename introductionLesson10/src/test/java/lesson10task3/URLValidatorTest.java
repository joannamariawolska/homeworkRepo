package lesson10task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class URLValidatorTest {

    @ParameterizedTest
    @MethodSource("provideCorrectUrl")
    void shouldBeTrueWhenUrlIsCorrect(String url) {
        boolean isCorrectUrl = URLValidator.isUrl(url);
        Assertions.assertTrue(isCorrectUrl);
    }

    @ParameterizedTest
    @MethodSource("provideNotCorrectUrl")
    void shouldBeFalseWhenUrlIsNotCorrect(String url) {
        boolean isCorrectUrl = URLValidator.isUrl(url);
        Assertions.assertFalse(isCorrectUrl);
    }

    private static Stream<Arguments> provideCorrectUrl() {
        return Stream.of(
                Arguments.of("http://onet.pl"),
                Arguments.of("https://mail.google.com"),
                Arguments.of("https://mail.google.com"),
                Arguments.of("http://wiadmosci.onet.pl"));
    }

    private static Stream<Arguments> provideNotCorrectUrl() {
        return Stream.of(
                Arguments.of("http2://onet.pl"),
                Arguments.of("httpss://mail.,,google.coooom"),
                Arguments.of("ht://mail.google.com"),
                Arguments.of("httpp://wiadmosci///.onet.pl"),
                Arguments.of("strona"),
                Arguments.of(" "));
    }
}