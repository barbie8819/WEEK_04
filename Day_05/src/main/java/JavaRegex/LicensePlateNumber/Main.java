package JavaRegex.LicensePlateNumber;

import java.util.Scanner;

public class Main {
    public static boolean isValidLicense(String username) {
        String regex = "^[A-Z]{2,2}[0-9]{4,4}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a License Plate Number : ");
        String username = scanner.nextLine();

        if (isValidLicense(username)) {
            System.out.println(" Valid License number !");
        } else {
            System.out.println(" Invalid License number !");
        }

        scanner.close();
    }
}
