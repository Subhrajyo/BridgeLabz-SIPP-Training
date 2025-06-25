public class BankAccount {
    // Static variable shared across all accounts
    static String bankName = "BridgeLabz Bank";
    // Static variable to keep track of total accounts
    private static int totalAccounts = 0;

    // Final variable for account number
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method to get total accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Bob", 1002, 3000.0);

        // Using instanceof to check before displaying details
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }
        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        // Display total accounts using static method
        BankAccount.getTotalAccounts();
    }
}