package AnnotationsJava.importantTask;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}
public class ReflectionDemo {
    @ImportantMethod(level = "CRITICAL")
    public void criticalTask() {
        System.out.println("Performing critical task...");
    }

    @ImportantMethod
    public void importantTask() {
        System.out.println("Performing important task...");
    }

    public void regularTask() {
        System.out.println("Performing regular task...");
    }
}
