import java.util.Scanner;
import java.lang.Math;

public class BankingApp {

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount ("Panos","BA00001");
        obj1.showMenu();
    }
}

class BankAccount {
    int balance;
    int PreviousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            PreviousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            PreviousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (PreviousTransaction > 0) {
            System.out.println("Deposited: " + PreviousTransaction);
        } else if (PreviousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(PreviousTransaction));
        } else {
            System.out.println("No transaction occured");
        }
    }

    void showMenu() {
        char option   = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "   + customerName);
        System.out.println("Your ID is "   + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("=======================================================================");
            System.out.println("Enter an Option");
            System.out.println("=======================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                System.out.println("---------------------------");
                System.out.println("Balance = "+balance);
                System.out.println("---------------------------");
                System.out.println("\n");
                    break;
            
                case 'B':
                System.out.println("---------------------------");
                System.out.println("Enter an amount to deposit: ");
                System.out.println("---------------------------");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println("\n");
                    break;

                case 'C':
                System.out.println("---------------------------");
                System.out.println("Enter an amount to Withdraw: ");
                System.out.println("---------------------------");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                break;

                case 'D':
                System.out.println("---------------------------");
                getPreviousTransaction();
                System.out.println("---------------------------");
                break;

                case 'E':
                System.out.println("********************************************************************");
                break;

                default:
                System.out.println("Invalid Option!! Please enter again");
                    break;
            }
        }while(option != 'E');
        System.out.println("Thank you for using our services");
    }
}