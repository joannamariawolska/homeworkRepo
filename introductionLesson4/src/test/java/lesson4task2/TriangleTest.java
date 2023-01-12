package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldBeArea() {
        //given
        Triangle triangle = new Triangle(5, 6, 4, 4.5);

        //when
        double area = triangle.getArea();

        //then
        Assertions.assertEquals(11.25, area);
    }

    @Test
    void shouldBePerimeter() {
        //given
        Triangle triangle = new Triangle(2, 3, 4, 2.5);

        //when
        double perimeter = triangle.getPerimeter();

        //then
        Assertions.assertEquals(9, perimeter);
    }
}