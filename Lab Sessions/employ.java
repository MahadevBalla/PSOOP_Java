import java.util.*;

class Employee{
 private String name, id;
 private int age;
 
 Employee(String name, String id, int age){
  this.name = name; this.id = id; this.age = age;
 }
 
 public void setName(String n){ name = n; }
 public void setId(String i){ id = i; }
 public void setAge(int a){ age = a; }
 public String getName(){ return name; }
 public String getId(){ return id; }
 public int getAge(){ return age; }
}

class SalariedEmployee extends Employee{
 private double empSalary;
 private int temp;
 
 public void setSalary(double salary){ empSalary = salary; }
 public double getSalary(){ return empSalary; }
 public void setTemp(int t){ temp = t; }
 public double getTemp(){ return empSalary; }
 
 SalariedEmployee(String name, String id, int age, double empSalary, int temp){
  super(name, id, age);
  setSalary(empSalary);
  setTemp(temp);
 }
 
 public void printDetails(){  
  if(temp==1){
   System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", getName(), getId(), getAge(), (empSalary + 2000), "Permanent");
  }
  else{
   System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", getName(), getId(), getAge(), empSalary, "On Contract");
  } 
 } 
}

class employ{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of employees : ");
  int n = sc.nextInt();
  double a = 0;
  int b = 0;
  sc.nextLine();  
  if(n>=5){
   SalariedEmployee e[] = new SalariedEmployee[n];
   for(int i=0; i<n; i++){   
    System.out.println("Enter details of employee " + (i+1));
    System.out.print("Name : ");
    String name = sc.nextLine();   
    System.out.print("Id : ");
    String id = sc.nextLine(); 
    System.out.print("Age : ");
    int age = sc.nextInt();
    sc.nextLine();   
    System.out.print("Salary : ");
    double salary = sc.nextDouble();
    if(a<salary){ a = salary; b = i; }
    System.out.print("Are you a permanent employee ?\n(1 = Yes, Any other integer = No) : ");
    int temp = sc.nextInt();
    sc.nextLine();
    e[i] = new SalariedEmployee(name,id,age,salary,temp);    
   }
   System.out.printf("\n%-20s %-20s %-20s %-20s %-20s\n", "Name", "Id", "Age", "Salary", "Permanent/On Contract");  
   for(int j=0; j<e.length; j++){
    e[j].printDetails(); 
   }
   System.out.println("\nDetails of employee with highest salary -\n");
   System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Name", "Id", "Age", "Salary", "Permanent/On Contract");
   e[b].printDetails();
  }
  else{
   System.out.println("You must enter details of atleast 5 employees");
  }
 }     
}
