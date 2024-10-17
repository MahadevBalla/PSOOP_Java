import java.util.*;

import javax.print.DocFlavor.STRING;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class UserException extends Exception{
    public UserException(String str){
        super(str);
    }
}

class vaccinegap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days;
        do{
            System.out.print("Enter gap between two vaccine doses : ");
            days = sc.nextInt();
            if(days<=0){
                try{
                    throw new UserException("User Defined Exception");
                }
                catch(Exception e){
                    System.out.println("Gap between two vaccine doses can't be negative.");              
                }
            }
            else if(days>100){
                try{
                    throw new UserException("User Defined Exception");
                }
                catch(Exception e){
                    System.out.println("Gap between two vaccine doses can't be greater than 100.");              
                }    
            }
        }
        while(days<=0 || days>100);
        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();
    }  
}
