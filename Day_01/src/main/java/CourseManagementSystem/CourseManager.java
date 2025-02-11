package CourseManagementSystem;

import java.util.List;

public class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course + " - " + course.evaluate());
        }
    }
}

