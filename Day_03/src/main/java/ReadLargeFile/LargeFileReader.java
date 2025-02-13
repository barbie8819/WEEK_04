package ReadLargeFile;
import java.util.*;
import java.io.*;
public class LargeFileReader {
    public static List<String> readErrorLines(String filePath) throws IOException {
        List<String> errorLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    errorLines.add(line);
                    System.out.println(line);
                }
            }
        }
        return errorLines;
    }

}