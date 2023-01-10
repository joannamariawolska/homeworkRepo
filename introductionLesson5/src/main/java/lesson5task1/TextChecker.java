package lesson5task1;

public class TextChecker {

    private static boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }

    public static boolean isPalindrome(String text) {
        if (!isEmpty(text)) {
            String reversedText = new StringBuilder(text).reverse().toString();
            return text.equals(reversedText);
        } else {
            return false;
        }
    }

    public static int getLength(String text) {
        if (!isEmpty(text)) {
            return text.length();
        } else {
            return 0;
        }
    }
}