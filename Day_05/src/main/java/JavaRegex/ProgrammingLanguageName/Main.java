package JavaRegex.ProgrammingLanguageName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String extractLanguages(String text) {
        Pattern pattern = Pattern.compile("\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|R|TypeScript|Scala|Perl)\\b");
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

    // Main method for manual testing
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println("Extracted Languages: " + extractLanguages(text));
    }
}
