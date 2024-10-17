import java.util.Scanner;

class Test{

 double base;
 int power, logbase, argument;
 
 Test(){
  this.base = 2; this.power = 2; this.logbase = 2; this.argument = 2;
 }
 
 double calculate(double base, int power){
 double x = 1; 
 while(power>0){
   x *= base;
   power--;
  }
  return x;
 }

 double calculate(int logbase, int argument){
 
 }
}

class calc{
 public static void main(String [] arr){
 Scanner sc = new Scanner();
  System.out.print("");
  
  
 }
}
