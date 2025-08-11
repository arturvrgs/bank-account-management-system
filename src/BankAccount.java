public abstract class BankAccount {
    private String accountHolderName;
    String accountNumber;
    protected double balance = 0;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    //aaaaaaaaaaaaaaaaaa
    public abstract void withdraw(double amount);

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
