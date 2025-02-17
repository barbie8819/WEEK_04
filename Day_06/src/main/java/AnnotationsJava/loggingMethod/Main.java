package AnnotationsJava.loggingMethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        ReflectionDemo demo = new ReflectionDemo();
        Class<ReflectionDemo> cls = ReflectionDemo.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    long start = System.nanoTime();
                    method.invoke(demo);
                    long end = System.nanoTime();
                    long duration = end - start;
                    System.out.printf("Method: %s executed in %d ns%n", method.getName(), duration);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
