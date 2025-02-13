package DataStreamsStudent;
import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentDataStreamTest {
    @Test
    void testSaveAndReadStudent() throws IOException {
        Student student = new Student(102, "Jane Doe", 3.85);
        String file = "C:\\Users\\scc\\Desktop\\Student.txt";

        StudentDataStream.saveStudentData(file, student);
        Student retrieved = StudentDataStream.readStudentData(file);

        assertEquals(student.rollNumber, retrieved.rollNumber);
        assertEquals(student.name, retrieved.name);
        assertEquals(student.gpa, retrieved.gpa);

        new File(file).delete();
    }

    @Test
    void testInvalidFile() {
        assertThrows(IOException.class, () -> StudentDataStream.readStudentData("invalid.dat"));
    }

}