package JUnitTesting.PasswordValidator;

public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String testPassword = "Passw0rd";
        System.out.println("Password '" + testPassword + "' is valid: " + validator.isValid(testPassword));
    }

}
