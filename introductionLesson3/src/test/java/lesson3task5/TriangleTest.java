package lesson3task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TriangleTest {

    @Test
    void shouldBeTrueForRightTriangle() {
        boolean isRight = Triangle.isRight(3, 4, 5);
        Assertions.assertEquals(true, isRight);
    }

    @Test
    void shouldBeFalseForNotRightTriangle() {
        boolean isRight = Triangle.isRight(12, 4, 8);
        Assertions.assertEquals(false, isRight);
    }
}