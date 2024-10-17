import java.util.Scanner;

class cal{

 double P, min, intensity, calcon;
 
 cal(){
 this.P = P; this.min = min; this.intensity = intensity; this.calcon = calcon;
 }

 double calccal(double P){
 return 70 * (P / 2.2) * 0.756;
 }

 double calccal(double P,double intensity,double min){
 return 0.0385 * intensity * P * min;
 }
 
 double calccal(double qty, double calcon){
 return 0.1 * qty * calcon;
 }
}

class bw{
 public static void main(String [] arr){

 Scanner sc = new Scanner(System.in);
 double totalcal = 0, foodcal = 0, basalmr = 0, calcon = 0, qty = 0, min = 0;
 System.out.print("Enter your bodyweight(in pounds) : ");
 double P = sc.nextDouble();
 if(P<0){ System.out.println("Invalid input!!"); }
 else{
 cal a = new cal();
 basalmr += a.calccal(P);
 System.out.println("Calories required to meet the basal metabolic rate : " + a.calccal(P));
 
 int x = 0;
  do{
  System.out.print("Calculate the calories required for physical activity\n1. Running(10mph)\n2. Running(6mph)\n3. Basketball\n4. Walking(1mph)\n5.Exit\nEnter your choice : ");
  x = sc.nextInt();
   switch(x){
    case 1: System.out.print("Enter time(in min) : ");
            min = sc.nextDouble();
            totalcal += a.calccal(P,17,min);
            System.out.println("Calories required : " + a.calccal(P,17,min));
            break;
    
    case 2: System.out.print("Enter time(in min) : ");
            min = sc.nextDouble();
            totalcal += a.calccal(P,10,min);
            System.out.println("Calories required : " + a.calccal(P,10,min));
            break;
    
    case 3: System.out.print("Enter time(in min) : ");
            min = sc.nextDouble();
            totalcal += a.calccal(P,8,min);
            System.out.println("Calories required : " + a.calccal(P,8,min));
            break;
    
    case 4: System.out.print("Enter time(in min) : ");
            min = sc.nextDouble();
            totalcal += a.calccal(P,1,min);
            System.out.println("Calories required : " + a.calccal(P,1,min));
            break;
    
    case 5: System.out.println("Your daily caloric requirement for physical activities : " + totalcal);
            break;
    
    default : System.out.println("Invalid input!!");  
   }
  }
  while(x!=5);
  
  int y = 0;
  do{
  System.out.print("Calculate the calories required for digestion\nChoose your favourite food\n1. Double Cheese Burger\n2. Pizza\n3. Ice cream\n4.Exit\nEnter your choice : ");
  y = sc.nextInt();
   switch(y){
    case 1: System.out.print("Enter quantity consumed : ");
            qty = sc.nextDouble();
            calcon = qty * 1000;
            foodcal += a.calccal(qty,calcon);
            System.out.println("Calories required : " + a.calccal(qty,calcon));
            break;
    
    case 2: System.out.print("Enter quantity consumed(in grams) : ");
            qty = sc.nextDouble();
            calcon = qty * 266;
            foodcal += a.calccal(qty,calcon);
            System.out.println("Calories required : " + a.calccal(qty,calcon));
            break;
    
    case 3: System.out.print("Enter quantity consumed(in grams) : ");
            qty = sc.nextDouble();
            calcon = qty * 207;
            foodcal += a.calccal(qty,calcon);
            System.out.println("Calories required : " + a.calccal(qty,calcon));
            break;
    
    case 4: System.out.println("Your daily caloric requirement for digestion : " + foodcal);
            break;
    
    default : System.out.println("Invalid input!!");
   }
  }
  while(y!=4);
  
  System.out.println("Total Daily Caloric Requirement : " + (foodcal+basalmr+totalcal));
 }
 }
}
