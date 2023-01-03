package lesson4task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrapezoidTest {

    @Test
    void shouldBeTrapezoidArea() {
        //given
        Trapezoid trapezoid = new Trapezoid(12, 4, 12, 13, 9);

        //when
        double area = trapezoid.getArea();

        //then
        Assertions.assertEquals(72.0, area);
    }

    @Test
    void shouldBeTrapezoidPerimeter() {
        //given
        Trapezoid trapezoid = new Trapezoid(5, 8, 10, 7, 6);

        //when
        double perimeter = trapezoid.getPerimeter();

        //then
        Assertions.assertEquals(30, perimeter);
    }
}