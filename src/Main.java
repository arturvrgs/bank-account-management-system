import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankService bankService = new BankService();

        while(true) {

            System.out.println("1. Create account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check account info");
            System.out.println("5. Exit");

            int option = scan.nextInt();

            if(option == 5) break;
            if(option == 1) bankService.createAccount();
            if(option == 2) bankService.deposit();
            if(option == 3) bankService.withdraw();
            if(option == 4) bankService.checkAccountInfo();

        }

        scan.close();
    }
}