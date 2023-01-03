package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void shouldGetAreaForCircle() {
        //given
        Circle circle = new Circle(5);

        //when
        double area = circle.getArea();

        //then
        Assertions.assertEquals(78.5, area);
    }

    @Test
    void shouldGetPerimeterForCircle() {
        //given
        Circle circle = new Circle(3);

        //when
        double perimeter = circle.getPerimeter();

        //then
        Assertions.assertEquals(18.84, perimeter);
    }
}