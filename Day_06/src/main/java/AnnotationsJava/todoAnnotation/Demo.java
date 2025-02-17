package AnnotationsJava.todoAnnotation;

import java.lang.annotation.*;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
public class Demo {
    @Todo(task = "Implement login functionality", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {
        System.out.println("Login feature pending implementation");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeQueries() {
        System.out.println("Database optimization pending");
    }

    public void completedFeature() {
        System.out.println("This feature is completed");
    }

}
