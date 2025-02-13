package ReadUserInputFromConsole;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoToFileTest {
    @Test
    void testSaveUserInfo() throws IOException {
        String fileName = "C:/Users/scc/Desktop/CopiedTo.txt";
        UserInfoToFile.saveUserInfo("Alice", "30", "Java", fileName);

        String content = Files.readString(Path.of("C:/Users/scc/Desktop/CopiedTo.txt"));
        assertTrue(content.contains("Name: Alice"));
        assertTrue(content.contains("Age: 30"));
        assertTrue(content.contains("Favorite Programming Language: Java"));

        Files.delete(Path.of(fileName));
    }

    @Test
    void testFileWritingException() {
        assertThrows(IOException.class, () -> {
            UserInfoToFile.saveUserInfo("Bob", "25", "Python", "/invalid_path/user_info.txt");
        });
    }

}