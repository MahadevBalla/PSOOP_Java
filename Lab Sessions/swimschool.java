import java.util.*;

class user{

 void display(int [][]arr){
    for (int i=0; i<arr.length; i++) {
        if(i==0){System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "", "Monday", "Tuesday", "Wednesday", "Thursday");}
        for (int j=0; j<arr[i].length; j++) {          
            if(i==1 && j==0){System.out.printf("%-15d", "11-12");}
            if(i==2 && j==0){System.out.printf("%-15d", "12-1");}
            if(i==3 && j==0){System.out.printf("%-15d", "1-2");}
            if(i==4 && j==0){System.out.printf("%-15d", "2-3");}
            System.out.printf("%-15d ", arr[i][j]);
        }
        System.out.println();
      }
 }
}

public class swimschool {
 public static void main (String []args){
  Scanner sc = new Scanner(System.in);
  int x = 0;
  int arrjeff[][] = {{1,1,0,0},{0,1,1,1},{0,1,1,0},{1,1,1,0}};
  int arranna[][] = {{1,1,0,1},{0,1,0,1},{1,1,0,0},{1,0,1,1}};
  user a = new user();

  a.display(arrjeff);
//    do{
//      System.out.print("1. Display schedules\n2. Mark a time slot as free/busy for Jeff\n3. Mark a time slot as free/busy for Anna\n4. Display available time slots for individual lessons\n5. Display available time slots for group lessons\n6. Exit\nEnter your choice : ");
//      x = sc.nextInt();
//      switch(x){
//       case 1: a.display(arrjeff);
//               a.display(arranna);
//               break;
      
//       case 2: System.out.println("Enter time slot : ");

//       case 3: 

//       case 4: 

//       case 5: 

//       case 6: break;

//       default: System.out.println("Invalid input!!");
//      }
//    }
//    while(x!=6);
 }
}