package lesson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseFormatterTest {

    @Test
    void shouldFormatTextToLowerCase() {
        //given
        LowerCaseFormatter formatter = new LowerCaseFormatter();

        //when
        String text = formatter.formatText("aBc");

        //then
        Assertions.assertEquals("abc", text);
    }
}