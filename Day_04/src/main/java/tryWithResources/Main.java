package tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

        public static void main(String[] args) {
            String fileName = "C:\\Users\\scc\\Desktop\\readme.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String firstLine = reader.readLine();
                System.out.println("First line: " + firstLine);

            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        }
    }


