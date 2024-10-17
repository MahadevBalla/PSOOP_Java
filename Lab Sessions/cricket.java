/*Define a class Cricketer which has:-


         Attributes:-


          ● player_name


          ● runs_hit


          ● innings_count


          ● not_out_count


          ● batting_avg


        Methods:-get_avg


            Make a cricket team with 11 cricketers. For each cricketer, find his batting average. Handle all different errors while calculating this. Also, make a method which will find he list of cricketers in ascending order of their batting average and also display the cricketer stats in this order. 


            Note- handle errors like ArrayIndexOutOfBoundsException, ArithmeticException,ArrayStoreException, NumberFormatException, etc
*/

import java.util.*;

class Cricketer{
    String player_name; 
    int runs_hit, innings_cnt, not_out_cnt;
    double batting_avg;

    Cricketer(String player_name, int runs_hit, int innings_cnt, int not_out_cnt){
        this.player_name = player_name; 
        this.runs_hit = runs_hit; 
        this.innings_cnt = innings_cnt; 
        this.not_out_cnt = not_out_cnt;
    }

    double get_avg(){
        batting_avg = runs_hit/(innings_cnt-not_out_cnt);
        return batting_avg;
    }
    
    void print(){
     System.out.printf("%-25s %-15s %-15s %-15s %-15s \n", player_name, batting_avg, runs_hit, innings_cnt, not_out_cnt);
    }
}

class UserException extends Exception{
    public UserException(String str){
        super(str);
    }
}

class cricket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cricketer c[] = new Cricketer[11];
        String player_name; 
        int runs_hit, innings_cnt, not_out_cnt, x;
        double batting_avg;

        
        do{
            System.out.println("Enter no of players : ");
            x = sc.nextInt();
            if(x!=11){
                try {
                    throw new UserException("User Defined Exception");                    
                } catch (Exception e) {
                    System.out.println("ArrayOutOfBound Exception");
                }
            }
        }
        while(x!=11);

        for(int i=0; i<11; i++){
        
            System.out.println("Enter details of player " + (i+1) + " -");
            
            System.out.print("Name : ");
            player_name = sc.nextLine();
            
            do{
             System.out.print("Runs Hit : ");
             runs_hit = sc.nextInt();
             if(runs_hit<0){
              try{
               throw new UserException("User Defined Exception");
              }
              catch(Exception e){
               System.out.println("Number of runs scored can't be negative.");              
              }
             }          
            }
            while(runs_hit<0);
            
            do{
             System.out.print("Innings Count : ");
             innings_cnt = sc.nextInt();
             if(innings_cnt<0){
              try{
               throw new UserException("User Defined Exception");
              }
              catch(Exception e){
               System.out.println("Innings count can't be negative.");              
              }
             }          
            }
            while(innings_cnt<0);
            
            do{
                System.out.print("Not Out Count : ");
                not_out_cnt = sc.nextInt();
                if(not_out_cnt<0){
                 try{
                  throw new UserException("User Defined Exception");
                 }
                 catch(Exception e){
                  System.out.println("Not out count can't be negative.");              
                 }
                }
                else if(not_out_cnt>innings_cnt){
                    try{
                        throw new UserException("User Defined Exception");
                       }
                       catch(Exception e){
                        System.out.println("Not out count can't be greater than innings count.");              
                       }
                }          
               }
               while(not_out_cnt<0 || not_out_cnt>innings_cnt);
               c[i] = new Cricketer(player_name, runs_hit, innings_cnt, not_out_cnt);
               sc.nextLine();
        }
        
        sort(c);
        
        System.out.println("Sorted List of Players in ascending order of their batting average -");
        System.out.printf("%-25s %-15s %-15s %-15s %-15s\n", "Name", "Batting Average", "Runs Hit", "Innings Count", "Not Out Count");        
        for(int k=0; k<c.length; k++){
        c[k].print();         
        }        
    }
    static void sort(Cricketer c[]){
     for(int i=0; i<c.length; i++){
      for(int j=0; j<c.length-i-1; j++){
       if(c[j].get_avg()>c[j+1].get_avg()){
        Cricketer temp = c[j];
        c[j] = c[j+1];
        c[j+1] = temp;     
       }
      }
     }    
    }
}