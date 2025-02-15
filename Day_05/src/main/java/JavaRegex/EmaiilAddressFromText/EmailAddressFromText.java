package JavaRegex.EmaiilAddressFromText;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressFromText {

        public static void extractEmails(String text) {
            String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text to extract emails:");
            String input = scanner.nextLine();

            System.out.println("Extracted Email Addresses:");
            extractEmails(input);

            scanner.close();
        }
    }

