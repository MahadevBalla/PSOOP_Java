import java.util.Scanner;

class Rectangle{

 double area(double l, double b){
  return l * b;
 }
 
 double perimeter(double l, double b){
  return 2*(l + b); 
 }
}

class rectangle{

 public static void main(String []arr){
 
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter length : ");
 double x= sc.nextDouble();
 System.out.print("Enter breadth : ");
 double y= sc.nextDouble();
 
 Rectangle r = new Rectangle();
 double a = r.area(x,y);
 double p = r.perimeter(x,y);
 
 System.out.println("Area of rectangle is : " + a);
 System.out.println("Area of rectangle is : " + p);
 
 }
}
