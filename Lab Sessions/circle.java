import java.util.Scanner;

class circ{
 
 double rad;
 double x,y;
 
circ(){
  x = 2; y=3; rad=5;
 }
 
 circ(circ c){
  this.x=c.x; this.y=c.y; this.rad=c.rad;
 }
 
// circ(double x, double y){
//this.x = 4; this.y = 10; 
// }
 
 circ(double rad, double x, double y){
  System.out.println("Values of x, y and radius are : " + x + ", "+ y + ", "+ rad + ". ");
 }
 
 void calcarea(double rad){
  System.out.println("Area of circle : " + 3.14159 * rad * rad); 
 }
 
 void calccircum(double rad){
  System.out.println("Circumference of circle : " + 2 * 3.14159 * rad);  
 }

}

class circle{
 public static void main(String [] arr){
 
  Scanner sc = new Scanner(System.in);
 
  System.out.print("Enter radius : ");
  double r = sc.nextDouble();
  System.out.print("Enter x coordinate of centre of circle : ");
  double x = sc.nextDouble();
  System.out.print("Enter y coordinate of centre of circle : ");
  double y = sc.nextDouble();  
 
  circ c1 = new circ();
 // circ c2 = new circ(2,3);
 circ c3 = new circ(c1);
 circ c4 = new circ(r,x,y);
   
  c1.calcarea(r);
  c4.calccircum(r);
  
  }
 }