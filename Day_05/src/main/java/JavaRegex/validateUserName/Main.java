package JavaRegex.validateUserName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.println(" Valid username!");
        } else {
            System.out.println(" Invalid username. Must start with a letter, be 5-15 characters long, and contain only letters, digits, or underscores.");
        }

        scanner.close();
    }
}
