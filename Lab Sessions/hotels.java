import java.util.*;

class Hotel{

 int id;
 String location;
 int rooms[];
   Hotel(int id, String location, int rooms[]){
      this.id = id;
      this.location = location;
      this.rooms = rooms;
   }

   void listHotels(Hotel h[],String loc){
      System.out.printf("\n%-20s %-20s\n", "Hotel ID", "Location");
        for(int i=0; i<h.length; i++){
         if(h[i].location == loc){
            System.out.printf("%-20s %-20s\n", h[i].id, h[i].location); 
         }
      }
      System.out.println();        
   }
   
   void listHotels(Hotel h[],int rType, String loc){
      System.out.printf("\n%-20s %-20s\n", "Hotel ID", "Count");
        for(int i=0; i<h.length; i++){
         if(h[i].location == loc){
            System.out.printf("%-20s %-20s\n", h[i].id, h[i].rooms[rType]);
        }
      }
   }
}

public class hotels{
    public static void main(String []args){

       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter number of hotels : ");
       int n = sc.nextInt();
       Hotel h[] = new Hotel[n];
       for(int i = 0; i < n; i++){
          System.out.println("Enter details for Hotel " + (i + 1) + ": ");
         
          System.out.print("Enter hotel ID: ");
          int id = sc.nextInt();

          System.out.print("Enter location of hotel : ");
          String location = sc.nextLine();
          sc.nextLine();

          System.out.print("Enter number of suites: ");
          int su = sc.nextInt();
 
          System.out.print("Enter number of deluxe rooms: ");
          int d = sc.nextInt();

          System.out.print("Enter number of standard rooms: ");
          int st = sc.nextInt();
          int []rooms = {su,d,st};
          h[i] = new Hotel(id,location,rooms);
        }

        System.out.print("\nEnter a location to search : ");
        String sLoc = sc.nextLine();
        sc.nextLine();
        h[0].listHotels(h, sLoc);

        System.out.print("Enter room type -\n1. Suite\n2. Deluxe\n3. Standard\nEnter your choice : ");
        int rType = sc.nextInt();
        if(rType>=1 && rType<=3){
         h[0].listHotels(h, rType-1,sLoc);
        }
        else{
         System.out.println("Invalid input!!");
        }
   }    
}