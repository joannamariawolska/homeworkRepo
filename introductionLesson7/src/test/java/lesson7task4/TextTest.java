package lesson7task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class TextTest {

    @ParameterizedTest
    @MethodSource("getLength")
    void shouldGetStringLength(String input, int expectedValue) {
        Assertions.assertEquals(Text.getLength(input), expectedValue);
    }

    public static Stream<Arguments> getLength(){
        return Stream.of(
                Arguments.of("Samochód", 8),
                Arguments.of("Auto", 4),
                Arguments.of("Koszyk", 6)
        );
    }
}