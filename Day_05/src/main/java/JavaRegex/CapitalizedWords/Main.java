package JavaRegex.CapitalizedWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void extractWords(String text) {
        String regex = "[A-Z]+[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence :");
        String input = scanner.nextLine();

        System.out.println("Extracted Capitalised words :");
        extractWords(input);

        scanner.close();
    }
}
