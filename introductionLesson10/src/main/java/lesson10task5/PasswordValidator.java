package lesson10task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean isCorrectPassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?!.*?(?:21)).{7,}$");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
        return matches;
    }
}