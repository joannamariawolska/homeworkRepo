package lesson4task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RhombusTest {

    @Test
    void shouldBeRhombusArea() {
        //given
        Rhombus rhombus = new Rhombus(6, 5);

        //when
        double area = rhombus.getArea();

        //then
        Assertions.assertEquals(30, area);
    }

    @Test
    void shouldBeRhombusPerimeter() {
        //given
        Rhombus rhombus = new Rhombus(4, 5);

        //when
        double perimeter = rhombus.getPerimeter();

        //then
        Assertions.assertEquals(16, perimeter);
    }
}