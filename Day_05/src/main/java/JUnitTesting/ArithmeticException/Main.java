package JUnitTesting.ArithmeticException;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Division result: " + calc.divide(10, 2));

        try {
            System.out.println("Division by zero: " + calc.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
