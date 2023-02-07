package lesson8task2;

public class MyList implements OwnList {
    private static final int VALUE_TO_INCREASE = 10;
    private Integer[] integerList;
    private int listSize;

    public MyList() {
        this.listSize = 0;
        this.integerList = new Integer[10];
    }

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public Integer get(int i) {
        return integerList[i];
    }

    @Override
    public void add(Integer element) {
        if (listSize % VALUE_TO_INCREASE == 0) {
            Integer[] newIntegerList = new Integer[listSize + VALUE_TO_INCREASE];
            for (int i = 0; i < listSize; i++) {
                newIntegerList[i] = integerList[i];
            }
            integerList = newIntegerList;
        }
        integerList[listSize] = element;
        listSize++;
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index >= listSize) {
            throw new ArrayIndexOutOfBoundsException("Such an index does not exist.");
        }

        if (listSize % VALUE_TO_INCREASE == 0) {
            Integer[] newIntegerList = new Integer[listSize + VALUE_TO_INCREASE];
            for (int i = 0; i < listSize; i++) {
                newIntegerList[i] = integerList[i];
            }
            integerList = newIntegerList;
        }

        for (int i = listSize; i > index; i--) {
            integerList[i] = integerList[i - 1];
        }
        integerList[index] = element;
        listSize++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= listSize) {
            throw new ArrayIndexOutOfBoundsException("Such an index does not exist.");
        }

        if (integerList.length > listSize * 2) {
            int newListLength = integerList.length / 2 + VALUE_TO_INCREASE;
            newListLength = newListLength - (newListLength % VALUE_TO_INCREASE);
            Integer[] newIntegerList = new Integer[newListLength];
            for (int i = 0; i < listSize; i++) {
                newIntegerList[i] = integerList[i];
            }
            integerList = newIntegerList;
        }

        for (int i = index; i < listSize - 1; i++) {
            integerList[i] = integerList[i + 1];
        }
        listSize--;
        return null;
    }
}