package JavaRegex.ReplaceAndModifyString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence :");
        String input = scanner.nextLine();

        System.out.println("Extracted Modified String :" +input.replaceAll("\\s+"," "));

        scanner.close();
    }
}
