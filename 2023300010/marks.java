import java.util.Scanner;

class Student{
 void name(){
 }
 
 int rollno(int r){
 return r;
 }
 
 int sub1(int s1){
 return s1;
 }
 
 int sub2(int s2){
 return s2;
 }
 
 int total(int s1, int s2){
 return s1+s2;
 }
 
 void grade(int s1, int s2){
  int n = (s1 + s2)/2;
  
  if(n<40){
  System.out.print("F grade");
  }
  else if(n>=40 && n<=60){
  System.out.print("B grade");
  }
  else if(n>=61 && n<=75){
  System.out.print("A grade");
  }
  else if(n>75){
  System.out.print("O grade");
  }
  
 }
 
}

class marks{

 public static void main(String []arr){
  
 Scanner sc = new Scanner(System.in);
 /*System.out.print("Enter number of students : ");
 int n = sc.nextInt();*/
 
 System.out.print("Enter your name : ");
 String name1 = sc.nextLine();
 
 System.out.print("Enter your Roll Number : ");
 int roll = sc.nextInt();
 
 System.out.println("Enter your marks : ");
 System.out.print("Subject 1 - ");
 int s1 = sc.nextInt();
 
 System.out.print("Subject 2 - ");
 int s2 = sc.nextInt();
 
 Student a = new Student();
 
 System.out.println("");
 System.out.println("Marksheet");
 System.out.println("Name : " + a.name(name1));
 System.out.println("Roll Number : " + a.rollno(roll));
 System.out.println("Marks - ");
 System.out.println("Subject 1 : " + a.sub1(s1));
 System.out.println("Subject 2 : " + a.sub2(s2));
 System.out.println("Total : " + a.total(s1,s2));
 System.out.println("Subject 1 : " + a.grade(s1,s2)); 
 
 }
}
