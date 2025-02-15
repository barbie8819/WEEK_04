package JavaRegex.ExtractWebPage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void WebPage(String text) {
        String regex = "https?://(www.)?[a-zA-Z0-9.-]+";
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

        System.out.println("Extracted Valid Web Pages are :");
        WebPage(input);

        scanner.close();
    }
}
