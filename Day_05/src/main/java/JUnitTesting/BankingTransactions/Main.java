package JUnitTesting.BankingTransactions;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
