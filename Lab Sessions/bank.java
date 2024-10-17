import java.util.Scanner;

class BankAccount {
    String depositorName;
    long accountNumber;
    String accountType;
    double balance;
    
    BankAccount(String name, long accNumber, String accType, double bal) {
        depositorName = name;
        accountNumber = accNumber;
        accountType = accType;
        balance = bal;
    }
    
    void deposit(double amount) {
        if(amount<0){
            System.out.println("Invalid!!");
        }
        else{
        balance += amount;
        System.out.println("Amount deposited successfully.\nBalance : " + balance);
        }
    }
  
    void withdraw(double amount) {
        if(amount<0){
            System.out.println("Invalid!!");
        }
        else if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.\nBalance : " + balance);
        } else {
            System.out.println("Insufficient funds!!");
        }
    }
   
    void displaynamebal() {
        System.out.println("Account holder's name : " + depositorName);
        System.out.println("Balance : " + balance);
    }
}

public class bank{
    public static void main(String [] arr) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your account number : ");
        long accno = scanner.nextLong();
        System.out.print("Enter your account type : ");
        String accType = scanner.next();
        System.out.print("Enter your initial balance : ");
        double bal = scanner.nextDouble();
        
        BankAccount account = new BankAccount(name, accno, accType, bal);
        
        int x;
        do {
            System.out.print("\n1. Deposit\n2. Withdraw\n3. Display\n4. Exit\nEnter your choice : ");
            x = scanner.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Enter amount to be deposited : ");
                    double depamt = scanner.nextDouble();
                    account.deposit(depamt);
                    break;
                case 2:
                    System.out.print("Enter amount to be withdrawn : ");
                    double withamt = scanner.nextDouble();
                    account.withdraw(withamt);
                    break;
                case 3:
                    account.displaynamebal();
                    break;
                case 4:
                    System.out.println("Thank you!!");
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
        } 
        while (x!=4);
    }
}