package AnnotationsJava.MaxLength;

public class Main {
    public static void main(String[] args) {
        try {
            User user = new User("shortName"); // Valid username
            System.out.println("Created user with username: " + user.getUsername());

            User invalidUser = new User("thisIsTooLong"); // Invalid username
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
