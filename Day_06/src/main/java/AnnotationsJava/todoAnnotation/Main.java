package AnnotationsJava.todoAnnotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Demo> cls = Demo.class;

        System.out.println("Pending tasks:");
        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.printf("Method: %s - Task: %s, Assigned to: %s, Priority: %s%n",
                        method.getName(), annotation.task(), annotation.assignedTo(), annotation.priority());
            }
        }
    }
}
