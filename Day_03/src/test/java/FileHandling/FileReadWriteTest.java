package FileHandling;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileReadWriteTest {
    @Test
    void testFileCopySuccess() throws IOException {
        String source = "C:/Users/scc/Desktop/readme.txt";
        String destination = "C:/Users/scc/Desktop/CopiedTo.txt";

        try (FileOutputStream fos = new FileOutputStream(source)) {
            fos.write("Hello, world! Hello? JAVA.".getBytes());
        }

        FileReadWrite.copyFile(source, destination);

        String content;
        try (FileInputStream fis = new FileInputStream(destination)) {
            content = new String(fis.readAllBytes());
        }

        assertEquals("Hello, world! Hello? JAVA.", content);
    }

    @Test
    void testFileNotFound() {
        assertThrows(FileNotFoundException.class, () -> FileReadWrite.copyFile("nonexistent.txt", "destination.txt"));
    }

}