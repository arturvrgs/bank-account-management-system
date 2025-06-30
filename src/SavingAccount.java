public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    public void withdraw(double amount) {
        if(amount < 100) {
            System.out.println("Insufficient funds. Minimum balance of $100 required.");
            return;
        }

        balance -= amount;
    }
}
