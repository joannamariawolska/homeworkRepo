package lesson2task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void shouldBeEvenWhenCheckingIfEven() {
        boolean isEvenNumber = Numbers.isEvenNumber(6);
        Assertions.assertEquals(true, isEvenNumber);
    }

    @Test
    void shouldBeNotEvenWhenCheckingIfEven() {
        boolean isEvenNumber = Numbers.isEvenNumber(3);
        Assertions.assertEquals(false, isEvenNumber);
    }

    @Test
    void shouldBeOddWhenCheckingIfOdd() {
        boolean isOddNumber = Numbers.isOddNumber(7);
        Assertions.assertEquals(true, isOddNumber);
    }

    @Test
    void shouldBeNotOddWhenCheckingIfOdd() {
        boolean isOddNumber = Numbers.isOddNumber(10);
        Assertions.assertEquals(false, isOddNumber);
    }
}