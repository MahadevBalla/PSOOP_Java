import java.util.Scanner;

class User{ 

 String name;
 double age, accbal, costofmovie;

 User(String name, double age, double accbal) {
        this.name = name;
        this.age = age;
        this.accbal = accbal;
    }
 
 void agebalcheck(double age, double accbal, double costofmovie){
    if(age>=18 && accbal>=costofmovie){
        System.out.println("You're eligible to watch this movie.");
    }
    if(accbal<costofmovie){
        System.out.println("Insufficient funds!!");
    }
    
 }
 
 void watchmovie(double age, double accbal, double costofmovie){
    if(age>=18 && accbal>=costofmovie){
        System.out.println("Your ticket has been successfully booked.\nRemaining Balance : " + (accbal-costofmovie));
    }
 }
 
}

class Movie{

 String MovieTitle1 = "Om Shanti Om";
 String MovieTitle2 = "Animal";
 String MovieTitle3 = "3 Idiots";
 double age1 = 10;
 double age2 = 18;
 double age3 = 12;
 double costofmovie1 = 599;
 double costofmovie2 = 799;
 double costofmovie3 = 699;
 
 void displaydetails(){
 System.out.println("\nMovie 1 -");
 System.out.println("Title : " + MovieTitle1);
 System.out.println("Age Restriction : " + age1);
 System.out.println("Cost of Movie : " + costofmovie1);

 System.out.println("\nMovie 2 -");
 System.out.println("Title : " + MovieTitle2);
 System.out.println("Age Restriction : " + age2);
 System.out.println("Cost of Movie : " + costofmovie2);
 
 System.out.println("\nMovie 3 -");
 System.out.println("Title : " + MovieTitle3);
 System.out.println("Age Restriction : " + age3);
 System.out.println("Cost of Movie : " + costofmovie3);
 }
 
}

class b{

 public static void main(String [] arr){
 
 double age1 = 10;
 double age2 = 18;
 double age3 = 12;
 double costofmovie1 = 599.35;
 double costofmovie2 = 799.35;
 double costofmovie3 = 699.35;

 Scanner sc = new Scanner(System.in);

 System.out.print("Enter your name : ");
 String name = sc.nextLine();
 System.out.print("Enter your age : ");
 Double age = sc.nextDouble();
 if(age<1){
    System.out.println("Invalid age !!");
 }
 else{
    System.out.print("Enter your account balance : ");
    Double bal = sc.nextDouble();
    if(bal<0){
        System.out.println("Invalid amount!!");
    }
    else{
        sc.nextLine();
   
        Movie a = new Movie();
        User c = new User(name,age,bal);
       
        a.displaydetails();
        System.out.print("\nEnter the title of the movie you want to watch : ");
        String moviename = sc.nextLine();
       
        switch(moviename){
         case "Om Shanti Om" : 
         if(age<age1){
           System.out.println("Age restriction !!(10+)");
         }
         else{
           c.agebalcheck(age,bal,costofmovie1);
           c.watchmovie(age, bal, costofmovie1);
         }
         break;
       
         case "Animal" :
         if(age<age2){
           System.out.println("Age restriction !!(18+)");
         }
         else{
         c.agebalcheck(age,bal,costofmovie2);
         c.watchmovie(age, bal, costofmovie2);
         }
         break;
       
         case "3 Idiots" :
         if(age<age3){
           System.out.println("Age restriction !!(10+)");
         }
         else{
         c.agebalcheck(age,bal,costofmovie3);
         c.watchmovie(age, bal, costofmovie3);
         }
         break;
       
         default :
         System.out.println("This movie isn't available on our platform !!");
       
         }
    }
  }
 }
}