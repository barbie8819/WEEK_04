package ResumeScreeningSystem;

abstract class JobRole {
    abstract String getJobDescription();
}
class SoftwareEngineer extends JobRole {
    public String getJobDescription() {
        return "Software Engineer: Develop and maintain software applications.";
    }
}

class DataScientist extends JobRole {
    public String getJobDescription() {
        return "Data Scientist: Analyze and interpret complex data.";
    }
}

class ProductManager extends JobRole {
    public String getJobDescription() {
        return "Product Manager: Oversee product development and strategy.";
    }
}