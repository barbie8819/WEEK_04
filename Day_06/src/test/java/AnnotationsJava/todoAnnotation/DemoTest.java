package AnnotationsJava.todoAnnotation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    private Demo demo;

    @BeforeEach
    void setUp() {
        demo = new Demo();
    }

    @Test
    void testAnnotatedMethodsPresence() {
        Method[] methods = Demo.class.getDeclaredMethods();
        long count = java.util.Arrays.stream(methods)
                .filter(m -> m.isAnnotationPresent(Todo.class))
                .count();
        assertEquals(2, count, "There should be exactly 2 @Todo-annotated methods.");
    }

    @Test
    void testLoginFeatureAnnotation() throws NoSuchMethodException {
        Method method = Demo.class.getDeclaredMethod("loginFeature");
        Todo annotation = method.getAnnotation(Todo.class);
        assertNotNull(annotation, "Annotation should be present.");
        assertEquals("Implement login functionality", annotation.task());
        assertEquals("Alice", annotation.assignedTo());
        assertEquals("HIGH", annotation.priority());
    }

    @Test
    void testOptimizeQueriesAnnotation() throws NoSuchMethodException {
        Method method = Demo.class.getDeclaredMethod("optimizeQueries");
        Todo annotation = method.getAnnotation(Todo.class);
        assertNotNull(annotation, "Annotation should be present.");
        assertEquals("Optimize database queries", annotation.task());
        assertEquals("Bob", annotation.assignedTo());
        assertEquals("MEDIUM", annotation.priority());
    }

    @Test
    void testCompletedFeatureNoAnnotation() throws NoSuchMethodException {
        Method method = Demo.class.getDeclaredMethod("completedFeature");
        assertFalse(method.isAnnotationPresent(Todo.class), "completedFeature should not have the @Todo annotation.");
    }

}