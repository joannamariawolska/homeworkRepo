package lesson4task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {

    @Test
    void getArea() {
        //given
        Trapezoid trapezoid = new Trapezoid(2, 3, 4, 5, 5);

        //when
        double area = trapezoid.getArea();

        //then
        Assertions.assertEquals(10.0, area);
    }

    @Test
    void getPerimeter() {
    }
}