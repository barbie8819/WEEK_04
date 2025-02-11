package CourseManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResearchCourseTest {

    private Course<ExamCourse> examCourseCatalog;
    private Course<AssignmentCourse> assignmentCourseCatalog;
    private Course<ResearchCourse> researchCourseCatalog;

    @BeforeEach
    void setUp() {
        examCourseCatalog = new Course<>();
        assignmentCourseCatalog = new Course<>();
        researchCourseCatalog = new Course<>();
    }

    @Test
    void testAddCourse() {
        ExamCourse course = new ExamCourse("Computer Science");
        examCourseCatalog.addCourse(course);
        assertEquals(1, examCourseCatalog.getCourses().size());
        assertEquals("Computer Science", examCourseCatalog.getCourses().get(0).getName());
    }

    @Test
    void testEvaluationMethods() {
        ExamCourse examCourse = new ExamCourse("Mathematics");
        AssignmentCourse assignmentCourse = new AssignmentCourse("History");
        ResearchCourse researchCourse = new ResearchCourse("Physics");

        assertEquals("Evaluation based on final exam performance.", examCourse.evaluate());
        assertEquals("Evaluation based on assignments and coursework.", assignmentCourse.evaluate());
        assertEquals("Evaluation based on research papers and presentations.", researchCourse.evaluate());
    }
}