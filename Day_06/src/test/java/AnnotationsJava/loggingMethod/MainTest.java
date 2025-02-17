package AnnotationsJava.loggingMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private ReflectionDemo demo;

    @BeforeEach
    void setUp() {
        demo = new ReflectionDemo();
    }

    @Test
    void testFastMethodExecution() throws NoSuchMethodException {
        Method method = ReflectionDemo.class.getDeclaredMethod("fastMethod");
        assertTrue(method.isAnnotationPresent(LogExecutionTime.class), "fastMethod should have @LogExecutionTime annotation.");
    }

    @Test
    void testSlowMethodExecution() throws NoSuchMethodException {
        Method method = ReflectionDemo.class.getDeclaredMethod("slowMethod");
        assertTrue(method.isAnnotationPresent(LogExecutionTime.class), "slowMethod should have @LogExecutionTime annotation.");
    }

    @Test
    void testExecutionTime() {
        long start = System.nanoTime();
        demo.fastMethod();
        long end = System.nanoTime();
        long duration = end - start;
        assertTrue(duration > 0, "Execution time should be positive.");
    }
}