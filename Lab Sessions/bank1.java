import java.util.*;

class Bank {
  double calcCI(double principal, double days){
  double interest = principal * (Math.pow((1 + 2 / 100), (days/365)));
  return interest; 
 }
}

class SBI extends Bank{
  double principal, days;
  SBI(){}
  SBI(double principal, double days){
    this.principal = principal; this.days = days;
  }

  @Override
  double calcCI(double principal, double days){
  double i1 = super.calcCI(principal, days);
  if(days>=7 && days<=14){
   i1 = principal * (Math.pow((1 + 3.1 / 100), (days/365)));
  }
  else if(days>=15 && days<=30){
   i1 = principal * (Math.pow((1 + 3.2 / 100), (days/365))); 
  }
  else if(days>=31 && days<=45){
   i1 = principal * (Math.pow((1 + 3.5 / 100), (days/365)));
  }
  else if(days>=46 && days<=90){
   i1 = principal * (Math.pow((1 + 4.5 / 100), (days/365)));
  }
  else if(days>=91 && days<=120){
   i1 = principal * (Math.pow((1 + 4.7 / 100), (days/365)));
  }
  else{
   i1 = principal * (Math.pow((1 + 4.9 / 100), (days/365)));
  }
  return i1; 
 } 
}

class Axis extends Bank{
    double principal, days;
    Axis(){}
    Axis(double principal, double days){
        this.principal = principal; this.days = days;
    }

    @Override
    double calcCI(double principal, double days){
    double i2 = super.calcCI(principal, days);
    if(days>=7 && days<=14){
     i2= principal * (Math.pow((1 + 3.15 / 100), (days/365)));
    }
    else if(days>=15 && days<=30){
     i2 = principal * (Math.pow((1 + 3.15 / 100), (days/365))); 
    }
    else if(days>=31 && days<=45){
     i2 = principal * (Math.pow((1 + 3.45 / 100), (days/365)));
    }
    else if(days>=46 && days<=90){
     i2 = principal * (Math.pow((1 + 4.05 / 100), (days/365)));
    }
    else if(days>=91 && days<=120){
     i2 = principal * (Math.pow((1 + 4.7 / 100), (days/365)));
    }
    else{
     i2 = principal * (Math.pow((1 + 5 / 100), (days/365)));
    }
    return i2; 
   }
}

class ICICI extends Bank{
    double principal, days;
    ICICI(){
    }
    ICICI(double principal, double days){
        this.principal = principal; this.days = days;
    }

    @Override
    double calcCI(double principal, double days){
    double i3 = super.calcCI(principal, days);
    if(days>=7 && days<=14){
     i3 = principal * (Math.pow((1 + 3 / 100), (days/365)));
    }
    else if(days>=15 && days<=30){
     i3 = principal * (Math.pow((1 + 3 / 100), (days/365))); 
    }
    else if(days>=31 && days<=45){
     i3 = principal * (Math.pow((1 + 3 / 100), (days/365)));
    }
    else if(days>=46 && days<=90){
     i3 = principal * (Math.pow((1 + 4.05 / 100), (days/365)));
    }
    else if(days>=91 && days<=120){
     i3 = principal * (Math.pow((1 + 4.1 / 100), (days/365)));
    }
    else{
     i3 = principal * (Math.pow((1 + 4.1 / 100), (days/365)));
    }
    return i3; 
   }
}

class bank{
 public static void main(String arr[]){
  Scanner sc = new Scanner(System.in);
  
  int x=0;
  do{
    System.out.print("Enter principal amount : ");
    double p = sc.nextDouble();
    System.out.println("Enter the number of days : ");
    int days = sc.nextInt();

    System.out.println("Do you want to check again for some other amount ??\n1. Yes\n2. No/Exit");
   
  }
  while(x!=2);
  SBI a = new SBI();
  Axis b = new Axis();
  ICICI c = new ICICI();

  System.out.printf("%-25s %-25s %-25s\n", "SBI", "Axis Bank", "ICICI Bank");
  System.out.printf("%-25s %-25s %-25s\n", a.calcCI(p,days), b.calcCI(p,days), c.calcCI(p,days));
 }
}