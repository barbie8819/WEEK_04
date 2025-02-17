package JUnitTesting.DateFormatterTesting;

public class Main {
    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        String formattedDate = formatter.formatDate("2025-02-17");
        System.out.println("Formatted date: " + formattedDate);
    }
}
