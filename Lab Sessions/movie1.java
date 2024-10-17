import java.util.*;

class movies{

 String name, genre, hero, heroine; double budget;

 movies(String name, String genre, String hero, String heroine, double budget){
 this.name = name; this.genre = genre; this.hero = hero; this.heroine = heroine; this.budget = budget;
 } 

 void sort(movies arr[]){
  int k=0;
  for (int i = 0; i < arr.length - 1; i++){
    for (int j = 0; j < arr.length - i - 1; j++){
        if(arr[j].name == arr[j + 1].name){           
         k++;
        }
      if (arr[j].budget > arr[j + 1].budget){
        movies temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
  System.out.println(k + " case(s) with identical movie title(s) has/have been encountered!!");
 }
}

class movie1{
 public static void main(String []args){

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of movies : ");
 int n = sc.nextInt();
 if(n>0){
    movies arr[] = new movies[n]; 
    for(int i=0; i<n; i++){
    System.out.println("Enter details of movie " + (i+1) + " -");
    System.out.print("Title of movie : ");
    String name = sc.nextLine();
    System.out.print("Genre : ");
    String genre = sc.nextLine();
    System.out.print("Name of hero : ");
    String hero = sc.nextLine();
    System.out.print("Name of heroine : ");
    String heroine = sc.nextLine();
    System.out.print("Budget(in crores) : ");
    double budget = sc.nextInt();
    if(budget<=0){
       System.out.println("Invalid input!!");
       break;
    }
    arr[i] = new movies(name,genre,hero,heroine,budget);
    }  
   arr[0].sort(arr);  
    for(int j=0; j<n; j++){
     if(j==0){
      System.out.printf("\nSorted List -\n%-30s %-15s %-20s %-20s %-15s\n", "Title", "Genre", "Hero", "Heroine", "Budget(in crores)");
     }
     System.out.printf("%-30s %-15s %-20s %-20s %-15s\n", arr[j].name, arr[j].genre, arr[j].hero, arr[j].heroine, arr[j].budget);
    }    
}
  else{
    System.out.println("Invalid input!!");
  }
 }
}