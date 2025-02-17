package AnnotationsJava.importantTask;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<ReflectionDemo> cls = ReflectionDemo.class;

        System.out.println("Annotated methods:");
        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName() + " - Level: " + annotation.level());
            }
        }
    }
}
