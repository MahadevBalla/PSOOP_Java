import java.util.*;

class Employee{
 private double salary=10000;
 
 public double getSalary(){
  return salary;
 }
 
 public double getBonus(){
  return 0;
 }
}

class Intern extends Employee{
  public double getSalary(){
  return 0.75 * super.getSalary();
 }
 
  public double getBonus(){
  return 500;
 }
}

class Clerk extends Employee{
  public double getSalary(){
  return 0.5 * super.getSalary();
 }
 
  public double getBonus(){
  return 1000;
 }
}

class Manager extends Employee{
  public double getSalary(){
  return 2 * super.getSalary();
 }
 
  public double getBonus(){
  return 2500;
 } 
}

class salary{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int x=0;
     do{
      
      System.out.print("1. Employee\n2. Intern\n3. Clerk\n4. Manager\n5. Exit\nEnter your choice : ");
      x = sc.nextInt();
      sc.nextLine();
      switch(x){
       case 1: System.out.print("Enter your details -\nName : ");
               String nameE = sc.nextLine();
               System.out.print("Age : ");
               int ageE = sc.nextInt();
               if(ageE>=18){
                Employee e = new Employee();
                System.out.println("Salary : " + e.getSalary() + "\nBonus : " + e.getBonus() + "\nTotal Salary : " + (e.getSalary() + e.getBonus()));
               }
               else if(ageE>0 && ageE<18){
                System.out.println("Age requirement not met!! You're not eligible for a job at ABC company.");
               }
               else if(ageE>0 && ageE<18){
                System.out.println("Age requirement not met!! You're not eligible for a job at ABC company.");
               }
               else{
                System.out.println("Invalid input!!");
               }
               break;
       
       case 2: System.out.print("Enter your details -\nName : ");
               String nameI = sc.nextLine();
               System.out.print("Age : ");
               int ageI = sc.nextInt();
               if(ageI>=18 && ageI<=30){
                Intern i = new Intern();
                System.out.println("Salary : " + i.getSalary() + "\nBonus : " + i.getBonus() + "\nTotal Salary : " + (i.getSalary() + i.getBonus()));
               }
               else if(ageI>0 && ageI<18 || ageI>30 ){
                System.out.println("Age requirement not met!! You're not eligible for an internship at ABC company.");
               }
               else{
                System.out.println("Invalid input!!");
               }
               break;
               
       
       case 3: System.out.print("Enter your details -\nName : ");
               String nameC = sc.nextLine();
               System.out.print("Age : ");
               int ageC = sc.nextInt();
               if(ageC>=18){
                Clerk c = new Clerk();
                System.out.println("Salary : " + c.getSalary() + "\nBonus : " + c.getBonus() + "\nTotal Salary : " + (c.getSalary() + c.getBonus()));
               }
               else if(ageC>0 && ageC<18){
                System.out.println("Age requirement not met!! You're not eligible for a job at ABC company.");
               }
               else{
                System.out.println("Invalid input!!");
               }
               break;
       
       case 4: System.out.print("Enter your details -\nName : ");
               String nameM = sc.nextLine();
               System.out.print("Age : ");
               int ageM = sc.nextInt();
               if(ageM>=18){
                Manager m = new Manager();
                System.out.println("Salary : " + m.getSalary() + "\nBonus : " + m.getBonus() + "\nTotal Salary : " + (m.getSalary() + m.getBonus()));
               }
               else if(ageM>0 && ageM<18){
                System.out.println("Age requirement not met!! You're not eligible for a job at ABC company.");
               }
               else{
                System.out.println("Invalid input!!");
               }
               break;
       
       case 5: System.out.println("Thank you!!");
               break;
       
       default: System.out.println("Invalid choice!!");
      }
     }
     while(x!=5);
 }
}