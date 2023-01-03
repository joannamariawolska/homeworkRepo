package lesson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFormatterTest {

    @Test
    void formatText() {
        //given
        UpperCaseFormatter formatter = new UpperCaseFormatter();

        //when
        String text = formatter.formatText("Aa");

        //then
        Assertions.assertEquals("AA", text);
    }
}