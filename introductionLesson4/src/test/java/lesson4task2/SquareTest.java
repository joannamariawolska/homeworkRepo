package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldBeAreaForSquare() {
        //given
        Square square = new Square(5);

        //when
        double area = square.getArea();

        //then
        Assertions.assertEquals(25, area);
    }

    @Test
    void shouldBePerimeterForSquare() {
        //given
        Square square = new Square(10);

        //when
        double perimeter = square.getPerimeter();

        //then
        Assertions.assertEquals(40, perimeter);
    }
}