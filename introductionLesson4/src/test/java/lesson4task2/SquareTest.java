package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldBeAreaForSquare() {
        //given
        Square square = new Square(7);

        //when
        double area = square.getArea();

        //then
        Assertions.assertEquals(49, area);
    }

    @Test
    void shouldBePerimeterForSquare() {
        //given
        Square square = new Square(8);

        //when
        double perimeter = square.getPerimeter();

        //then
        Assertions.assertEquals(32, perimeter);
    }
}