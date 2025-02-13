package BufferedStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import static BufferedStreams.BufferedFileCopy.copyFileWithBuffer;

public class Main {
    public static void main(String[] args) {
        String source = "C:/Users/scc/Desktop/readme.txt";
        String destinationBuffered = "C:/Users/scc/Desktop/CopiedTo.txt";
        String destinationUnbuffered = "C:/Users/scc/Desktop/Buffer.txt";

        try {
            long startBuffered = System.nanoTime();
            copyFileWithBuffer(source, destinationBuffered);
            long endBuffered = System.nanoTime();
            System.out.println("Buffered copy completed in: " + (endBuffered - startBuffered) + " ns");

            long startUnbuffered = System.nanoTime();
            try (FileInputStream fis = new FileInputStream(source);
                 FileOutputStream fos = new FileOutputStream(destinationUnbuffered)) {
                int data;
                while ((data = fis.read()) != -1) {
                    fos.write(data);
                }
            }
            long endUnbuffered = System.nanoTime();
            System.out.println("Unbuffered copy completed in: " + (endUnbuffered - startUnbuffered) + " ns");

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
