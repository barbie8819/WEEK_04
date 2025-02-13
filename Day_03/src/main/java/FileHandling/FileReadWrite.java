package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void copyFile(String sourceFile, String destinationFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        }
    }
}
