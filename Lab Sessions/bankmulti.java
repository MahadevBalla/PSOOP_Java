import java.util.*;

class Bank {
  double calcCI(double principal, double days){
  double interest = principal * (Math.pow((1 + 2 / 100), (days/365)));
  return interest; 
 }
}

class SBI extends Bank{
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

class bankmulti{
 public static void main(String arr[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter amount 1 : ");
  double p1 = sc.nextDouble();
  System.out.print("Enter amount 2: ");
  double p2 = sc.nextDouble();
  System.out.print("Enter amount 3 : ");
  double p3 = sc.nextDouble();

  System.out.print("Enter the number of days : ");
  int days = sc.nextInt();
  SBI a = new SBI();
  Axis b = new Axis();
  ICICI c = new ICICI();

  System.out.println("Amount after applying C.I. -");
  System.out.printf("%-25s %-25s %-25s %-25s\n", "Amount", "SBI", "Axis Bank", "ICICI Bank");
  System.out.printf("%-25s %-25s %-25s %-25s\n", p1, a.calcCI(p1,days), b.calcCI(p1,days), c.calcCI(p1,days));
  System.out.printf("%-25s %-25s %-25s %-25s\n", p2, a.calcCI(p2,days), b.calcCI(p2,days), c.calcCI(p2,days));
  System.out.printf("%-25s %-25s %-25s %-25s\n", p3, a.calcCI(p3,days), b.calcCI(p3,days), c.calcCI(p3,days));
 }
}
