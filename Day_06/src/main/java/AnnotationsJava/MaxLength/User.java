package AnnotationsJava.MaxLength;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
 @interface MaxLength {
    int value();
}
public class User {
    private String username;

    public User(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username cannot exceed 10 characters");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
