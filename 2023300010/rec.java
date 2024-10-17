import java.util.Scanner;

class RectangleArea{

 double area(double l, double b){
  return l * b;
 }
}
 
class RectanglePerimeter{

 double perimeter(double l, double b){
  return 2 * (l + b);
 }
}

class rec{

 public static void main(String []arr){
 
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter length : ");
 double x= sc.nextDouble();
 System.out.print("Enter breadth : ");
 double y= sc.nextDouble();
 
 RectangleArea r1 = new RectangleArea();
 double a = r1.area(x,y);
 
 RectanglePerimeter r2 = new RectanglePerimeter();
 double p = r2.perimeter(x,y);
 
 System.out.println("Area of rectangle is : " + a);
 System.out.println("Area of rectangle is : " + p);
 
 }
}
