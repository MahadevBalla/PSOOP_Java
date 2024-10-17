import java.util.*;

interface SavingsAccount {
	public double getSimpleInterest(double principal, double rate, double time);    
}

interface CurrentAccount {
	public double getCompoundInterest(double principal, double rate, double time);    
}

class Customer implements SavingsAccount, CurrentAccount{

	@Override
	public double getCompoundInterest(double principal, double rate, double time){
    	return principal*(1 + ((rate*time)/100));
	}

	@Override
	public double getSimpleInterest(double principal, double rate, double time){
    	return principal * (Math.pow((1 + (rate/100)), (time/365)));   	 
	}
}

class bankinter{
	public static void main(String[] args){
    	Scanner sc =new Scanner(System.in);
    	int accType, time; double balance, rate;
    	System.out.println("Enter your details -");
    	do{
        	System.out.print("Account type\n1. Savings Account\n2. Current Account\nEnter your choice : ");
        	accType = sc.nextInt();
        	if(accType!=1 && accType!=2){
            	System.out.println("Enter a valid input!!");
        	}
    	}
    	while(accType!=1 && accType!=2);
    	do{
        	System.out.print("Balance : ");
        	balance = sc.nextDouble();
        	if(balance<0){
            	System.out.println("Enter a valid input!!");
        	}
    	}
    	while(balance<0);
    	do{
        	System.out.print("Rate of Interest : ");
        	rate = sc.nextDouble();
        	if(rate<0){
            	System.out.println("Enter a valid input!!");
        	}
    	}
    	while(rate<0);  	 
    	do{
        	System.out.print("Time Period(in days) : ");
        	time = sc.nextInt();
        	if(time<0){
            	System.out.println("Enter a valid input!!");
        	}
    	}
    	while(time<0);

    	Customer c = new Customer();

    	if(accType==1){
        	System.out.println("Previous Balance : " + balance + "\nCurrent Balance : " + c.getSimpleInterest(balance,rate,time));
    	}
    	else{
        	System.out.println("Previous Balance : " + balance + "\nCurrent Balance : " + c.getCompoundInterest(balance,rate,time));
    	}
	}
}
