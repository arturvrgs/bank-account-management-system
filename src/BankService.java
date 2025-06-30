import java.util.ArrayList;
import java.util.Scanner;

public class BankService {

    ArrayList<BankAccount> db = new ArrayList<>();

    public void createAccount() {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Create saving account");
        System.out.println("2. Create current account");

        int accountType = scan.nextInt();
        scan.nextLine();

        if(accountType == 1) {
            System.out.println("Enter your full name: ");
            String accountHolderName = scan.nextLine();

            BankAccount savingAccount = new SavingAccount(Integer.toString(db.size() + 1), accountHolderName);
            db.add(savingAccount);

            System.out.println("Saving account created.");
        }

        if(accountType == 2) {
            System.out.println("Enter your full name: ");
            String accountHolderName = scan.nextLine();
            BankAccount currentAccount = new CurrentAccount(Integer.toString(db.size() + 1),accountHolderName);
            db.add(currentAccount);

            System.out.println("Current account created.");
        }
    }

    public void deposit() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your account number to deposit: ");
        int accountNumber = scan.nextInt();

        if(accountNumber < 0 || accountNumber >= db.size()) {
            System.out.println("This account doesn't exist.");
            return;
        }

        System.out.println("Enter the amount to deposit: ");
        int amount = scan.nextInt();

        db.get(accountNumber).deposit(amount);

        System.out.println("You deposited $" + amount + "in " + db.get(accountNumber).getAccountHolderName() + " account.");
    }

    public void withdraw() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your account number to withdraw: ");
        int accountNumber = scan.nextInt();

        if(accountNumber < 0 || accountNumber >= db.size()) {
            System.out.println("This account doesn't exist.");
            return;
        }

        System.out.println("Enter the amount to withdraw: ");
        int amount = scan.nextInt();

        db.get(accountNumber).withdraw(amount);

        System.out.println("You withdrew $" + amount + "in " + db.get(accountNumber).getAccountHolderName() + " account.");
    }

    public void checkAccountInfo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your account number: ");
        int accountNumber = scan.nextInt();

        if(accountNumber < 0 || accountNumber >= db.size()) {
            System.out.println("This account doesn't exist.");
            return;
        }

        System.out.println("Holder name: " + db.get(accountNumber).getAccountHolderName());
        System.out.println("Account number: " + db.get(accountNumber).getAccountNumber());
        System.out.println("Balance: " + db.get(accountNumber).getBalance());
    }




}
