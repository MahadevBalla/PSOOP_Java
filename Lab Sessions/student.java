import java.util.*;

abstract class Course{
    abstract void studentDetails();
}

class Comps extends Course{
    private String name; private long UID;private int year;
    Comps(String name, long UID, int year){
        this.name = name; this.UID = UID; this.year = year;
    }
    void studentDetails(){
        System.out.printf("%-25s %-25s %-25s\n", name, UID, year);
    }

    public int getYear(){ return year; }
    
    void sort(Comps arr[]){
        int z=0,k=0;
        for (int i = 0; i < arr.length - 1; i++){
          for (int j = 0; j < arr.length - i - 1; j++){
            if(arr[j].UID == arr[j + 1].UID){
                z++;
            }
            if(arr[j].name.equalsIgnoreCase(arr[j + 1].name)){           
             k++;
            }
            if (arr[j].year > arr[j + 1].year){
              Comps temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
          }
        }
        System.out.println(z + " case(s) with identical UID(s) has/have been encountered!!");
        System.out.println(k + " case(s) with identical name(s) has/have been encountered!!");
       } 
}

class IT extends Course{
    private String name; private long UID;private int year;
    IT(String name, long UID, int year){
        this.name = name; this.UID = UID; this.year = year;
    }

    void studentDetails(){
        System.out.printf("%-25s %-25s %-25s\n", name, UID, year);
    }

    public int getYear(){ return year; }

    void sort(IT arr[]){
        int z=0,k=0;
        for (int i = 0; i < arr.length - 1; i++){
          for (int j = 0; j < arr.length - i - 1; j++){
            if(arr[j].UID == arr[j + 1].UID){
                z++;
            }
            if(arr[j].name.equalsIgnoreCase(arr[j + 1].name)){           
             k++;
            }
            if (arr[j].year > arr[j + 1].year){
              IT temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
          }
        }
        System.out.println(z + " case(s) with identical UID(s) has/have been encountered!!");
        System.out.println(k + " case(s) with identical name(s) has/have been encountered!!");
       }
      
}

class student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> Year = new HashMap<Integer,String>();
        Year.put(1,"F.E.");
        Year.put(2,"S.E.");
        Year.put(3,"T.E.");
        Year.put(4,"B.E.");

        int n1=0, n2=0, year=0; Long UID=0L;
        do{
         System.out.print("Enter the number of Comps students : ");
         n1 = sc.nextInt();
         if(n1<=0){ System.out.println("Enter a valid input!!");}
        }
        while(n1<=0);
        Comps s1[] = new Comps[n1];
        sc.nextLine();
        for(int i=0; i<n1; i++){
            System.out.print("Enter details of student " + (i+1) + " -\nName : ");
            String name = sc.nextLine();
            do{
             System.out.print("UID : ");
             UID = sc.nextLong();
             if(UID<=0){ System.out.println("Enter a valid input!!"); }
            }
            while(UID<=0);
            do{
             System.out.print("Year : ");
             year = sc.nextInt();
             if(year<=0 || year>4){ System.out.println("Enter a valid input!!"); }
            }
            while(year<=0 || year>4);
            s1[i] = new Comps(name, UID, year);
            sc.nextLine();
        }
        
        do{
         System.out.print("Enter the number of IT students : ");
         n2 = sc.nextInt();
         if(n2<=0){ System.out.println("Enter a valid input!!");}
        }
        while(n2<=0);
        IT s2[] = new IT[n2];
        sc.nextLine();
        for(int i=0; i<n2; i++){
         System.out.print("Enter details of student " + (i+1) + " -\nName : ");
         String name = sc.nextLine();
         do{
          System.out.print("UID : ");
          UID = sc.nextLong();
          if(UID<=0){ System.out.println("Enter a valid input!!"); }
         }
         while(UID<=0);
         do{
          System.out.print("Year : ");
          year = sc.nextInt();
          if(year<=0 || year>4){ System.out.println("Enter a valid input!!"); }
         }
         while(year<=0 || year>4);
         s2[i] = new IT(name, UID, year);
         sc.nextLine();
        }
        
        s1[0].sort(s1);
        s2[0].sort(s2);

        System.out.println("Details of Comps Students -");
        System.out.printf("%-25s %-25s %-25s\n", "Name", "UID", "year");
        for(int i=0; i<n1; i++){
         s1[i].studentDetails();
        }

        System.out.println("Details of IT Students -");
        System.out.printf("%-25s %-25s %-25s\n", "Name", "UID", "year");
        for(int i=0; i<n1; i++){
         s1[i].studentDetails();
        }        
    }
}