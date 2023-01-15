package lesson6task9;

public class NumberChecker {

    public static void validate(int[] values){

        for(int value: values){
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException();
                }
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int[] tab = {4, 5, 9, 8};
        validate(tab);
    }
}