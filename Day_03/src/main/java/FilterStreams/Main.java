package FilterStreams;
import java.io.*;

import static FilterStreams.UppercaseToLowercaseConverter.convertToLowercase;

public class Main {
    public static void main(String[] args) {
        String inputFile = "C:/Users/scc/Desktop/readme.txt";
        String outputFile = "C:/Users/scc/Desktop/CopiedTo.txt";

        try {
            convertToLowercase(inputFile, outputFile);
            System.out.println("File converted to lowercase successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
