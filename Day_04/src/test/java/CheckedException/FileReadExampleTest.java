package CheckedException;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileReadExampleTest {
    @Test
    public void testFileExists() {
        try {
            FileReader file = new FileReader("C:\\Users\\scc\\Desktop\\readme.txt");
            BufferedReader reader = new BufferedReader(file);

            assertNotNull(reader.readLine());
            reader.close();
        } catch (IOException e) {
            fail("IOException should not occur if file exists");
        }
    }

    @Test
    public void testFileNotFound() {
        Exception exception = assertThrows(IOException.class, () -> {
            FileReader file = new FileReader("nonexistent.txt");
        });

        assertEquals(FileNotFoundException.class, exception.getClass());
    }

}