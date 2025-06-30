public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount < -500) {
            System.out.println("Overdraft limit exceeded.");
            return;
        }

        balance -= amount;
    }
}
