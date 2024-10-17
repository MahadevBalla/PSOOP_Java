import java.util.Scanner;

class Bankacc{

 String name(String m){
 return m;
 }
 
 int accno(int n){
 return n;
 }
 
 String acctype(String a){
 return a;
 }
 
 double balance(double b){
 return b;
 }
 
 double deposit(double bal, double x){
 bal = bal + x;
 return bal;
 }
 
 double withdraw(double bal, double h){
 if (h>bal){
 System.out.println("Insufficient funds !!");
 }
 
 else {
 bal -= h;
 System.out.println("Rs." + h + "have been withdrawn");
  }
 return bal;
 } 
 
 void namebal(String c, double bal){
 System.out.println("Account holder's name : " + c);
 System.out.println("Balance : " + bal);
 }
 
}

class bank{

 public static void main(String []arr){
 
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter your name : ");
 String name1 = sc.nextLine();
 
 System.out.print("Enter your account number : ");
 int accno1 = sc.nextInt();
 
 sc.nextLine();
 
 System.out.print("Enter type of your account : ");
 String acctype1 = sc.nextLine();
 
 double bal=0;
 
 Bankacc a = new Bankacc();
 
 System.out.println("Your bank account details -");
 System.out.println("Name : " + a.name(name1));
 System.out.println("Account number : " + a.accno(accno1));
 System.out.println("Account type : " + a.acctype(acctype1));
 System.out.println("Balance : " + a.balance(bal));
 int x;
 
do {

 System.out.print("1.Deposit\n2.Withdraw\n3.Display name and balance\n4.Exit\nEnter your choice : ");
 x=sc.nextInt();
 sc.nextLine();

switch(x) 

{

case 1:
 System.out.println("Enter amount to be deposited : ");
 double q = sc.nextDouble();
 System.out.println("Balance : " + a.deposit(bal,q));
 break;

case 2:
 System.out.println("Enter amount to be withdrawn : ");
 double p = sc.nextDouble();
 double z=a.withdraw(bal,p);
 System.out.println("Balance : " + z);
 break;

case 3:
 a.namebal(name1,bal);
 break;

case 4:
System.out.println("Thank you !!");
break;

default : 
System.out.println("Wrong Choice !!");

 }
} 

while(x!=4);
  
 }
}
