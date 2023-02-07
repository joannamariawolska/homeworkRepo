package lesson8task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyListTest {

    @Test
    void shouldBeEmptyWhenListIsEmpty() {
        // given
        MyList MyIntegerList = new MyList();
        // when
        MyIntegerList.add(10);
        MyIntegerList.remove(0);
        // then
        Assertions.assertTrue(MyIntegerList.isEmpty());
    }

    @Test
    void shouldAddElementToTheEndOfList() {
        // given
        int element = 7;
        MyList myIntegerList = new MyList();
        // when
        myIntegerList.add(element);
        // then
        Assertions.assertEquals(element, myIntegerList.get(0));
    }

    @Test
    void shouldAddElementUnderIndex() {
        // given
        int element = 2;
        int index = 1;
        MyList MyIntegerList = new MyList();
        MyIntegerList.add(1);
        MyIntegerList.add(3);
        // when
        MyIntegerList.add(index, element);
        // then
        Assertions.assertEquals(element, MyIntegerList.get(index));
    }

    @Test
    void shouldRemoveElementFromIndex() {
        // given
        int index = 1;
        MyList MyIntegerList = new MyList();
        MyIntegerList.add(5);
        MyIntegerList.add(7);
        // when
        MyIntegerList.remove(index);
        // then
        Assertions.assertEquals(5, MyIntegerList.get(MyIntegerList.size() - 1));
    }
}
