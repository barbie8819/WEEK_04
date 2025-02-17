package AnnotationsJava.importantTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionDemoTest {

        private ReflectionDemo demo;

        @BeforeEach
        void setUp() {
            demo = new ReflectionDemo();
        }

        @Test
        void testAnnotatedMethodsPresence() {
            Method[] methods = ReflectionDemo.class.getDeclaredMethods();
            long count = java.util.Arrays.stream(methods)
                    .filter(m -> m.isAnnotationPresent(ImportantMethod.class))
                    .count();
            assertEquals(2, count, "There should be exactly 2 annotated methods.");
        }

        @Test
        void testCriticalTaskAnnotationLevel() throws NoSuchMethodException {
            Method method = ReflectionDemo.class.getDeclaredMethod("criticalTask");
            ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
            assertNotNull(annotation, "Annotation should be present.");
            assertEquals("CRITICAL", annotation.level(), "Annotation level should be CRITICAL.");
        }

        @Test
        void testImportantTaskAnnotationDefaultLevel() throws NoSuchMethodException {
            Method method = ReflectionDemo.class.getDeclaredMethod("importantTask");
            ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
            assertNotNull(annotation, "Annotation should be present.");
            assertEquals("HIGH", annotation.level(), "Default level should be HIGH.");
        }

        @Test
        void testRegularTaskNoAnnotation() throws NoSuchMethodException {
            Method method = ReflectionDemo.class.getDeclaredMethod("regularTask");
            assertFalse(method.isAnnotationPresent(ImportantMethod.class), "Regular task should not have the annotation.");
        }
}