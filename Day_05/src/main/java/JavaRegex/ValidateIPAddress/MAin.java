package JavaRegex.ValidateIPAddress;

import java.util.Scanner;

public class MAin {

    public static boolean isValidAddress(String input) {
        String regex =  "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
        return input.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a IPv4 Address : ");
        String input = scanner.nextLine();

        if (isValidAddress(input)) {
            System.out.println(" Valid address!");
        } else {
            System.out.println(" Invalid Address. ");
        }

        scanner.close();
    }
    }

