package CourseManagementSystem;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> examCourseCatalog = new Course<>();
        examCourseCatalog.addCourse(new ExamCourse("Mathematics"));
        examCourseCatalog.addCourse(new ExamCourse("sanskrit"));
        Course<AssignmentCourse> assignmentCourseCatalog = new Course<>();
        assignmentCourseCatalog.addCourse(new AssignmentCourse("History"));

        Course<ResearchCourse> researchCourseCatalog = new Course<>();
        researchCourseCatalog.addCourse(new ResearchCourse("Physics"));
        System.out.println("Courses Available:");
        CourseManager.displayCourses(examCourseCatalog.getCourses());
        CourseManager.displayCourses(assignmentCourseCatalog.getCourses());
        CourseManager.displayCourses(researchCourseCatalog.getCourses());
    }

}