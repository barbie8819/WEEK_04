package CourseManagementSystem;


abstract class CourseType {
    private String name;

    public CourseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String evaluate();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + name;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }

    @Override
    public String evaluate() {
        return "Evaluation based on final exam performance.";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name);
    }

    @Override
    public String evaluate() {
        return "Evaluation based on assignments and coursework.";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) {
        super(name);
    }

    @Override
    public String evaluate() {
        return "Evaluation based on research papers and presentations.";
    }
}
