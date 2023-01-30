package lesson9task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class BubbleSortTest {

    @ParameterizedTest
    @MethodSource("provideUnsortedNumbers")
    void shouldSortNumbers(List<Integer> inputNumbers, List<Integer> expected) {
        //given
        BubbleSort<Integer> sorter = new BubbleSort<>();
        //when
        sorter.sort(inputNumbers);
        //then
        Assertions.assertEquals(expected, inputNumbers);
    }

    @ParameterizedTest
    @MethodSource("provideUnsortedNames")
    void shouldSortNames(List<String> inputNames, List<String> expected) {
        //given
        BubbleSort<String> sorter = new BubbleSort<>();
        //when
        sorter.sort(inputNames);
        //then
        Assertions.assertEquals(expected, inputNames);
    }

    private static Stream<Arguments> provideUnsortedNumbers() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 3, 2), List.of(1, 2, 3)),
                Arguments.of(Arrays.asList(5, 7, 2), List.of(2, 5, 7)),
                Arguments.of(Arrays.asList(9, 5, 20), List.of(5, 9, 20))
        );
    }

    private static Stream<Arguments> provideUnsortedNames() {
        return Stream.of(
                Arguments.of(Arrays.asList("Kasia", "Michał", "Ania"), List.of("Ania", "Kasia", "Michał")),
                Arguments.of(Arrays.asList("Marek", "Hubert", "Adam"), List.of("Adam", "Hubert", "Marek")),
                Arguments.of(Arrays.asList("Paweł", "Zuzia", "Marta"), List.of("Marta", "Paweł", "Zuzia"))
        );
    }
}