package JavaRegex.ValidDateFormate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void ValidDate(String text) {
        String regex = "\\b[0-9]{2}/[0-9]{2}/[0-9]{4}\\b";
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

        System.out.println("Extracted Valid dates are :");
        ValidDate(input);

        scanner.close();
    }
}
