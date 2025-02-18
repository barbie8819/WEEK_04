package ReflectionJava.BasicProblems.CreatObjects;

import java.lang.reflect.Constructor;

class Student {
    private String name;

    public Student() {
        this.name = "Default Name";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CreateObjectUsingReflection {
    public static void main(String[] args) {
        try {
            // Dynamically create an instance using the default constructor
            Class<?> studentClass = Class.forName("Student");
            Constructor<?> defaultConstructor = studentClass.getDeclaredConstructor();
            Object studentInstance = defaultConstructor.newInstance();

            // Access and print the name field
            Student student = (Student) studentInstance;
            System.out.println("Student name (default constructor): " + student.getName());

            // Dynamically create an instance using the parameterized constructor
            Constructor<?> paramConstructor = studentClass.getDeclaredConstructor(String.class);
            Object paramStudent = paramConstructor.newInstance("John Doe");

            // Access and print the name field
            Student namedStudent = (Student) paramStudent;
            System.out.println("Student name (parameterized constructor): " + namedStudent.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
