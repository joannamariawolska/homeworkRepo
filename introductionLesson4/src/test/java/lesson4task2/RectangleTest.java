package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldBeArea() {
        //given
        Rectangle rectangle = new Rectangle(5, 4);

        //when
        double area = rectangle.getArea();

        //then
        Assertions.assertEquals(20, area);
    }

    @Test
    void shouldBePerimeter() {
        //given
        Rectangle rectangle = new Rectangle(8, 6);

        //when
        double perimeter = rectangle.getPerimeter();

        //then
        Assertions.assertEquals(28, perimeter);
    }
}