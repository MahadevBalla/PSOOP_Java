import java.util.Scanner;

class Movie{

 String moviename(String m){
 return m;
 }
 
 String genre(String a){
 return a;
 }
 
  String hero(String h){
 return h;
 }
 
 String heroine(String b){
 return b;
 }
 
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
 Movie a = new Movie();
 
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
 Movie b = new Movie(); 
 
 if(budget1>budget2){
 System.out.println("Name of movie having higher budget : " + name1);
 }
 else{
 System.out.println("Name of movie having higher budget : " + name2);
 }
 }
}
