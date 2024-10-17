import java.util.Scanner;

class Posting{

 /*private*/ int courseWork, TechTest, interview, AptTest;
  
  
 Posting(){
  this.courseWork = courseWork;
  this.TechTest = TechTest;
  this.interview = interview;
  this.AptTest = AptTest;  
 }
  
 public Posting(int interview){
  if(interview>=90){
   System.out.println("You're eligible for the designation 'Project Manager'.");
  }
  else{
   System.out.println("You're ineligible for the designation 'Project Manager'.");
  }
 }
 
 public Posting(int TechTest, int interview){
 if(interview>=85 && TechTest>=85){
   System.out.println("You're eligible for the designation 'Team Leader'.");
  }
  else{
   System.out.println("You're ineligible for the designation 'Team Leader'.");
  }  
 }
 
 public Posting(int courseWork, int AptTest, int TechTest, int interview){ 
  if(interview>=80 && TechTest>=80 && AptTest>=80 && courseWork>=80){
   System.out.println("You're eligible for the designation 'Programmer'.");
  }
  else{
   System.out.println("You're ineligible for the designation 'Programmer'.");
  } 
 }
 
}

class recruit{

 public static void main(String [] arr){
  
 Scanner sc = new Scanner(System.in);
 int y=0;
 do{
 System.out.print("Enter marks of all the exams(Max. 100)\nCourse Work marks : ");
 int cwm = sc.nextInt();
 if(cwm < 100 || cwm > 0){
 System.out.print("Aptitude Test marks : ");
 int atm = sc.nextInt();
 if(atm < 100 || atm > 0){
 System.out.print("Technical Test marks : ");
 int ttm = sc.nextInt();
 if(ttm < 100 || ttm > 0){
 System.out.print("Marks scored in the interview round: ");
 int im = sc.nextInt();
 if(im < 100 || im > 0){
 System.out.print("Enter the post you're applying for -\n1. Programmer\n2. Team Leader\n3. Manager\n4. Exit\nEnter your choice : ");
 y = sc.nextInt();
 Posting post = new Posting();
 int x = (cwm+atm+ttm+im)/4;
 
 switch(y){
 case 1: Posting programmer = new Posting(cwm,atm,ttm,im);
         if(x>=85){ Posting teamLeader = new Posting(ttm,im); }
         if(x>=90){ Posting manager = new Posting(im); }
         break;
         
 case 2: Posting teamLeader = new Posting(ttm,im);
         if(x>=90){ Posting manager = new Posting(im); }
         break;
 
 case 3: Posting manager = new Posting(im);
         break;
 case 4: System.out.println("Thank You!!");
         break;
 
 default : System.out.println("Invalid choice!!");
 
 } 
 
 }
 else{ System.out.println("Invalid marks!!"); }
 }
 else{ System.out.println("Invalid marks!!"); }
 }
 else{ System.out.println("Invalid marks!!"); }
 }
 else{ System.out.println("Invalid marks!!"); }  
 }
 while(y!=4);
 
 }
}
