/*There is an abstract class Account

Attribute:-

● Name

● Balance

● Acc_No

Method:-

● Deposit - abstract method

● withdraw - abstract method

● display - abstract method


Saving Account inherits the Account class and provides the implementation for the methods accordingly

Saving Account class Attribute:-

● interestRate

● minBalance

Method

● addInterest: handle Arithmetic Exception

● transfer():

Note:

● Balance cannot be less than 0.

● In a Saving account if minBalance is set then for that the balance cannot go less than that amount. If it goes, an error must be shown.

● let the user deposit to or withdraw from the account. For each transaction, a message is displayed to indicate the status of the transaction: successful or failed. In case of failure, the failure reason is reported.

● The possible Exceptions are negative-amount-exception and insufficient-amount-exception.

For the above scenario write an interactive program in Java. Also, show output for different use cases.*/

import java.util.*;

abstract class Account{
    String depositorName;
    long accountNumber;
    double balance;
    Account(String name, long accNumber, double bal) {
        depositorName = name;
        accountNumber = accNumber;
        balance = bal;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void display();
}

class SavingsAccount extends Account{
    double rate;
    SavingsAccount(String name, long accNumber, double bal, double rate){
        super(name, accNumber, bal); this.rate = rate;
    }
    
    void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited successfully.\nBalance : " + balance);
    }
  
    void withdraw(double amount){
            balance -= amount;
            System.out.println("Amount withdrawn successfully.\nBalance : " + balance);
    }
   
    void display(){
        System.out.println("Account holder's name : " + depositorName);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

    double getSimpleInterest(double principal, double rate, double time){
        balance = principal * (Math.pow((1 + (rate/100)), (time/365)));
        return balance;	 
	}
}

class UserException extends Exception{
    public UserException(String str){
        super(str);
    }
}

class trycatchbank{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int time; double balance, minbalance, rate; long accno;
  System.out.println("Enter your details -");
  System.out.print("Name : ");
  String name = sc.nextLine();
  do{
      System.out.print("Account number : ");
      accno= sc.nextInt();
  }
  while(accno<0);
  do{
    System.out.print("Set Min. Balance : ");
    minbalance = sc.nextDouble();
    if(minbalance<=0){
      try{
          throw new UserException("User Defined Exception");
      }
     catch(UserException e){
      System.out.println("Minimum balance should be greater than 0");
     }
    }
  }          
    while(minbalance<=0);
  do{
      System.out.print("Balance : ");
      balance = sc.nextDouble();
      if(balance<minbalance){
        try{
            throw new UserException("User Defined Exception");
        }
       catch(UserException e){
        System.out.println("Balance should be greater than min. balance(" + minbalance + ")");
       }
      }
  }          
  while(balance<minbalance);
  do{
      System.out.print("Rate of Interest : ");
      rate = sc.nextDouble();
      if(rate<0){
        try {
            throw new UserException("User Defined Exception");            
        } catch (UserException e) {
            System.out.println("Rate of interest can't be negative.");
        }
      }
  }
  while(rate<0);  	 
  do{
      System.out.print("Time Period(in days) : ");
      time = sc.nextInt();
      if(time<0){
        try {
            throw new UserException("User Defined Exception");            
        } catch (UserException e) {
            System.out.println("Number of days can't be negative!!");
        }
      }
  }
  while(time<0);

  SavingsAccount account = new SavingsAccount(name, accno, balance, rate);
  System.out.println("New balance : " + account.getSimpleInterest(balance, rate, time));

  int x;
        do{
            System.out.print("\n1. Deposit\n2. Withdraw\n3. Display\n4. Exit\nEnter your choice : ");
            x = sc.nextInt();

            switch(x){
                case 1: System.out.print("Enter amount to be deposited : ");
                        double depamt = sc.nextDouble();
                        if(depamt<0){
                            try {
                                throw new UserException("User Defined Exception");
                            } catch (UserException e) {
                                System.out.println("Negative amount can't be deposited");
                            }
                        }
                        else{
                            account.deposit(depamt);
                        }
                        break;

                case 2: System.out.print("Enter amount to be withdrawn : ");
                        double withamt = sc.nextDouble();
                        if(withamt>account.balance){
                            try {
                                throw new UserException("User Defined Exception");
                            } catch (UserException e) {
                                System.out.println("Transaction failed. Insufficient funds!!");
                            }
                        }
                        else if(withamt<0){
                            try {
                                throw new UserException("User Defined Exception");
                            } catch (UserException e) {
                                System.out.println("Negative/Zero amount can't be withdrawn.");
                            }
                        }
                        else{
                            account.withdraw(withamt);
                        }               
                        break;

                case 3: account.display();
                        break;

                case 4: System.out.println("Thank you!!");
                        break;

                default:
                    System.out.println("Invalid choice!!");
            }
        } 
        while (x!=4);
    }
}