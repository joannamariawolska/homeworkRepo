package lesson2task3;

import lesson2task3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        int sum = Calculator.sum(1,1);
        Assertions.assertEquals(2, sum);
    }
    @Test
    void shouldSubtractTwoValues() {
        int subtract = Calculator.subtract(5, 3);
        Assertions.assertEquals(2, subtract);
    }
    @Test
    void shouldMultiplyTwoValues() {
        int multiply = Calculator.multiply(3, 4);
        Assertions.assertEquals(12, multiply);
    }
    @Test
    void shouldDivideTwoValues() {
        int divide = Calculator.divide(10, 2);
        Assertions.assertEquals(5, divide);
    }
}