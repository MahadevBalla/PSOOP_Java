import java.util.*;
public class bankinherit
{
public static void main(String[] args)
{
Scanner sc = new Scanner (System.in);
System.out.println("\t***WELCOME TO HDFC BANK***");

System.out.println("");
System.out.print("Enter your name : ");
String cust_name = sc.nextLine();
System.out.print("Enter your Account Number : ");

int acc_no;
while(true)
{
//System.out.print("-->");

acc_no =

sc.nextInt();

if(acc_no>0)
{
break;
}

System.out.print("Please Enter a valid value ( •̀- •́ ) -->");

}
sc.nextLine();
System.out.print("Enter your Balance : ");
double saving_bal;
while(true)
{
//System.out.print("-->");

saving_bal =

sc.nextDouble();

if(saving_bal>=500)

{
break;
}

System.out.print("minimum balance must be MORE THAN 500 as per company policy , Please Enter Correct Value :");

}

//double saving_bal = sc.nextDouble();
sc.nextLine();
acc_details user1 = new

acc_details(500.00d,saving_bal,cust_name,acc_no);

while(true)
{ System.out.println("");
System.out.println("You can perform the following actions :: ");

System.out.println("Press 1 to deposit money");

System.out.println("Press 2 to withdraw money");

System.out.println("Press 3 to view account details");

System.out.println("Press 4 to Exit");

int choice;
while(true)
{
System.out.print("-->");

choice =

sc.nextInt();

if(choice == 1 ||

choice == 2 || choice == 3 || choice == 4)
{
break;
}

System.out.println("Please Enter a valid value (•̀- •́ ) -->");

}

double amt;
switch (choice)
{
case 1:

System.out.print("Enter deposit amount : ");
//double amt
while(true)
{

//System.out.print("-->");

amt =

sc.nextDouble();

if(amt>0)
{
break;
}

System.out.print("Please Enter a valid value ( •̀- •́ ) -->");

}
user1.deposit(amt);
break;
case 2:

System.out.print("Enter withdraw amount : ");
while(true)
{
//System.out.print("-->");

amt =

sc.nextDouble();

if(amt>0)
{
break;
}

System.out.print("Please Enter a valid value ( •̀- •́ ) -->");

}
user1.withdraw(amt);
break;
case 3:
user1.display();
break;
case 4:
System.out.println("You have logged out successfully :)");

System.exit(0);
break;
}

}
}
}
class account

{
String cust_name;
int acc_no;
account(String cust_name,int acc_no)
{
this.cust_name = cust_name;
this.acc_no = acc_no;
}
}
class saving_acc extends account
{
double min_bal,saving_bal;
saving_acc(double min_bal,double saving_bal,String
cust_name,int acc_no)
{
super(cust_name,acc_no);
this.min_bal = min_bal;
this.saving_bal = saving_bal;
}
}
class acc_details extends saving_acc
{
acc_details(double min_bal,double
saving_bal,String cust_name,int acc_no)
{
super(min_bal,saving_bal,cust_name,acc_no);
}
void deposit(double amt)
{

saving_bal += amt;
System.out.println("Your Transaction was successful");

System.out.println("Your Current Balance : "+saving_bal);
}
void withdraw(double amt)
{
if((saving_bal-amt)>=min_bal)
{
saving_bal -= amt;
System.out.println("Your Transaction was successful");

System.out.println("Your Current Balance : "+saving_bal);

}
else

{
System.out.println("Your Transaction was NOT successful , since your balance falls below minimum balance");

System.out.println("minimum Balance as per company policy : "+min_bal);

System.out.println("Your Current Balance : "+saving_bal);

}
}
void display()
{
System.out.println("User Details :: ");
System.out.println("Name : "+cust_name);
System.out.println("Account Number : "+acc_no);
System.out.println("Balance :"+saving_bal);
}
}