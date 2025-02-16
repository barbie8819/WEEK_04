package JavaRegex.ValidateSSN;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static JavaRegex.RepeatingWords.MAin.findRepeatedWords;

public class Main {
    public static String validateSSN(String text) {
        Pattern pattern = Pattern.compile("\\b\\d{3}-\\d{2}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return  matcher.group() + " is valid";
        }
        return " No valid SSN found";
    }
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";
        System.out.println(validateSSN(text));

          }
}
