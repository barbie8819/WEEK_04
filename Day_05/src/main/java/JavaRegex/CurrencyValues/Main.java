package JavaRegex.CurrencyValues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String extractCurrencyValues(String text) {
        Pattern pattern = Pattern.compile("\\$?\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(matcher.group());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String text = "The price is $45.99 and the discount is 10.50 ";
        System.out.println("Extracted Currency Values: " + extractCurrencyValues(text));
    }
}

