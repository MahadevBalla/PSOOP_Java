import java.util.Scanner;

class diary{

 String moviename;
 
 String genre;
 
 String hero;
 
 String heroine;
 
 double budget(double c){
 return c;
 }
 
 void displaydetails(String q, String w, String e, String r, double t){
 System.out.println("Name : " + q);
 System.out.println("Genre : " + w);
 System.out.println("Name of Hero : " + e);
 System.out.println("Name of Heroine : " + r);
 System.out.println("Budget : " + t);
 }
 
}

class movie{

 public static void main(String []arr){
 
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter details of 1st movie -\nName of movie : ");
 String name1 = sc.nextLine();
 
 System.out.print("Genre : ");
 String genre1 = sc.nextLine();
 
 System.out.print("Name of hero : ");
 String hero1 = sc.nextLine();
 
 System.out.print("Name of heroine : ");
 String heroine1 = sc.nextLine();
 
 System.out.print("Budget : ");
 double budget1 = sc.nextInt();
 sc.nextLine();
 diary a = new diary();
 
 System.out.print("Enter details of 2nd movie -\nName of movie : ");
 String name2 = sc.nextLine();
 
 System.out.print("Genre : ");
 String genre2 = sc.nextLine();
 
 System.out.print("Name of hero : ");
 String hero2 = sc.nextLine();
 
 System.out.print("Name of heroine : ");
 String heroine2 = sc.nextLine();
 
 System.out.print("Budget : ");
 double budget2 = sc.nextInt();
 sc.nextLine();
 diary b = new diary();
 
 System.out.println("\nDetails of 1st movie : ");
 a.displaydetails(name1,genre1,hero1,heroine1,budget1);
 System.out.println("\nDetails of 2nd movie : ");
 b.displaydetails(name2,genre2,hero2,heroine2,budget2);
 
 
 if(budget1>budget2){
 System.out.println("\nName of movie having higher budget : " + name1);
 }
 else{
 System.out.println("\nName of movie having higher budget : " + name2);
 }
 }
}