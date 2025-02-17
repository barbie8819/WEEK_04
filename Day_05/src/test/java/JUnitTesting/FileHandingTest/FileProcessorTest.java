package JUnitTesting.FileHandingTest;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private static final String TEST_FILE = "C:\\Users\\scc\\Desktop\\readme.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "JUnit test content";
        fileProcessor.writeToFile(TEST_FILE, content);
        String result = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Content");
        assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }

    @Test
    void testReadNonexistentFileThrowsIOException() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}