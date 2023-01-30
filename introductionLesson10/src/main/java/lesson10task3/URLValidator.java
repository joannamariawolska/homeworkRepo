package lesson10task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {

    public static boolean isUrl(String input) {

        Pattern pattern = Pattern.compile("(https?://|www\\\\.)[-a-zA-Z0-9+&@#/%?=~_|!:.;]*[-a-zA-Z0-9+&@#/%=~_|]");
        Matcher matcher = pattern.matcher(input);
        boolean matches = matcher.matches();
        return matches;
    }
}