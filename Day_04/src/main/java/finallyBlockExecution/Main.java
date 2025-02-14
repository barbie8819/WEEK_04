package finallyBlockExecution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result = 0;

        try {
            System.out.print("Enter the first integer: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            num2 = scanner.nextInt();

            result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. ");
        } finally {
            System.out.println("Operation completed.");
        }

        scanner.close();
    }
}
