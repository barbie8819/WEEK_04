package JUnitTesting.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        System.out.println("Is connected: " + db.isConnected());
        db.disconnect();
        System.out.println("Is connected: " + db.isConnected());
    }
}
