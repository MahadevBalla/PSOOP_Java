import java.util.*;

class Person{
 String name; Date date;
 Person(String name, Date date){
  this.date=date; this.name=name;
 }
 
 public String toString(){  
  return name + " " + date;  
 }  
}

class Doctor extends Person{
  String speciality; double fees,income;
  Doctor(String name, Date date, String speciality, double fees, double income){
  super(name,date);
  this.speciality=speciality; this.fees=fees; this.income=income;
 }
 

 @Override public String toString(){  
  return name + " " + date + " " + speciality + " " + fees + " " + income;  
 }  
}

class Patient extends Person{
 Doctor d;
 Patient(String name, Date date, Doctor d){
  super(name,date);
 }
 
 @Override public String toString(){ 
  return name + " " + date + " " + d + " ";  
 }  
}

class Billing{
  Patient p;
  Doctor d;
  double amt; 
  Date date;

  Billing(Patient patient, Doctor doctor, Date date, double amountDue) {
    this.p = patient;
    this.d = doctor;
    this.date = date;
    this.amt = amountDue;
  }

  @Override public String toString() {
    return p.name + " " + d.name + " " + date + " " + amt;
}
}

public class tp {
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter details of doctor 1 -\nName : ");
  String n1 = sc.nextLine();
  System.out.print("Speciality : ");
  String s1 = sc.nextLine();
  System.out.print("Fees : ");
  double f1 = sc.nextDouble();
  sc.nextLine();
  System.out.print("Income : ");
  double i1 = sc.nextDouble(); 
  Doctor doc1 = new Doctor(n1,new Date(),s1,f1,i1);

  System.out.print("Enter details of doctor 2 -\nName : ");
  String n2 = sc.nextLine();
  System.out.print("Speciality : ");
  String s2 = sc.nextLine();
  System.out.print("Fees : ");
  double f2 = sc.nextDouble();
  sc.nextLine();
  System.out.print("Income : ");
  double i2 = sc.nextDouble();
  Doctor doc2 = new Doctor(n2,new Date(),s2,f2,i2);
  if(doc1==doc2){System.out.println("Duplicate case detected!!");}
  
  System.out.print("Enter details of patient 1 -\nName : ");
  String n3 = sc.nextLine();
  System.out.print("1. Doctor 1\n2. Doctor 2\nEnter integer to select : ");
  int z1 = sc.nextInt();
  sc.nextLine();
  if(z1==1){
    Patient pat1 = new Patient(n3, new Date(),doc1);
  }
  else if(z1==2){
    Patient pat1 = new Patient(n3,new Date(),doc2);
  }
  else{ System.out.println("Invalid input!!"); }

  System.out.print("Enter details of patient 2 -\nName : ");
  String n4 = sc.nextLine();
  System.out.print("Admitted date : ");
  int d4 = sc.nextInt();
  sc.nextLine();
  System.out.print("1. Doctor 1\n2. Doctor 2\nEnter an int : ");
  int z2 = sc.nextInt();
  if(z2==1){
    Patient pat1 = new Patient(n3,new Date(),doc1);
  }
  else if(z2==2){
    Patient pat1 = new Patient(n3,new Date(),doc2);
  }
  else{ System.out.println("Invalid input!!"); }
  
  private static final double calculateBill(Patient patient, Date billingDate, Doctor doctor) {
    Date admittedDate = patient.date;
    long daysAdmitted = (billingDate.getTime() - admittedDate.getTime()) / (1000 * 60 * 60 * 24);
    double patientBill = daysAdmitted * 2000 + doctor.fees * daysAdmitted;
    return patientBill;
  }
 }
}