package lesson10task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
   public static boolean checkPesel(String pesel) {

      Pattern pattern = Pattern.compile("\\d{11}");
      Matcher matcher1 = pattern.matcher(pesel);
      return matcher1.matches();
   }
}