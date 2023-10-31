import java.util.Scanner;

public class BankAccount {
int accountNumber;
String accountName;
double balance;
static Scanner sc = new Scanner (System.in);

    public static void main (String [] args) {
        BankAccount b = new BankAccount();
        byte choice;
        b.account();

        do {
            System.out.println("=============");
            System.out.println("\n[Menu Selection] \n1 - Deposit \n2 - Withdraw \n3 - Display Balance \n0 - Exit");
            choice = sc.nextByte();

            switch (choice) {
                case 1:
                    b.deposit();
                    break;
                case 2:
                    b.withdraw();
                    break;
                case 3:
                    b.displayBalance();
                    break;
                case 0:
                    System.out.println("Goodbye...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option!");
            }
        } while (choice != 0);
    }

    void account() {
        System.out.println("[Welcome to Online Banking]");
        System.out.println("=============");
        System.out.print("Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Account Name: ");
        accountName = sc.nextLine();
        System.out.print("Enter Balance: ");
        balance = sc.nextInt();

        System.out.println("Successfully Logged In! \nAccount Number: " + accountNumber + "\nAccount Name: " + accountName);
    }

    void deposit() {
        System.out.println("=============");
        System.out.print("Enter Amount to Deposit: ");
        double depo = sc.nextDouble();
        if (depo <= 0) {
            System.out.println("Unsuccesful Deposit: [Invalid Amount]");
        } else {
            balance += depo;
            System.out.println("Deposited: [" + depo + "]");
        }
    }

    void withdraw() {
        System.out.println("=============");
        System.out.print("Enter Amount to Withdraw: ");
        double draw = sc.nextDouble();
        if (balance >= draw) {
            balance -= draw;
            System.out.println("Withdrawed: [" + draw + "]");
        } else {
            System.out.println("Unsuccesful Withdraw: [Insufficient Balance]");
        }
    }

    void displayBalance() {
        System.out.println("=============");
        System.out.println("Account Number:\t[" + accountNumber + "]\nAccount Name: \t[" + accountName + "]");
        System.out.println("Total Balance: \t[" + balance + "]");
    }    
}
