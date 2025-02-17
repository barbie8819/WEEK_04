package JUnitTesting.FileHandingTest;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor();
        String filename = "C:\\Users\\scc\\Desktop\\readme.txt";
        String content = "Hello, File Handling!";
        try {
            fp.writeToFile(filename, content);
            System.out.println("Written: " + content);
            String readContent = fp.readFromFile(filename);
            System.out.println("Read: " + readContent);
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }
}
