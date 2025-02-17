package JUnitTesting.UserRegistration;

public class Main {
    public static void main(String[] args) {
        UserResgister  registration = new UserResgister ();
        registration.registerUser("JohnDoe", "john.doe@example.com", "SecurePass1");
    }
}
