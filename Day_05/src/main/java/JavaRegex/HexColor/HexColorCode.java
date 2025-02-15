package JavaRegex.HexColor;

import java.util.Scanner;

public class HexColorCode {
    public static boolean isValidHexCode(String code) {
        String regex = "^[#][0-9A-Fa-f]{6,6}$";
        return code.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Hex color code : ");
        String code = scanner.nextLine();

        if (isValidHexCode(code)) {
            System.out.println(" Valid Hex code  !");
        } else {
            System.out.println(" Invalid Hex color code !");
        }

        scanner.close();
    }
}
