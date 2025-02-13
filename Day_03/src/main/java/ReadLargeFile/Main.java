package ReadLargeFile;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\scc\\Downloads\\100mb-examplefile-com.txt";
        try {
            LargeFileReader.readErrorLines(filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
