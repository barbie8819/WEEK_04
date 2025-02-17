package JUnitTesting.UserRegistration;

public class UserResgister {
    public void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, contain one uppercase letter, and one digit.");
        }
        System.out.println("User registered successfully: " + username);
    }
}
