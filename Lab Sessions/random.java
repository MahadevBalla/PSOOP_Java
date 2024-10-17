import java.util.*;

class Number extends Thread{
    static int random_num;

    public void run(){
        while(true){
            Random random = new Random();
            int randomNumber = random.nextInt(1000);
            System.out.println("Random Integer generated: " + randomNumber);
            Square t2 = new Square(randomNumber);      
            Cube t3 = new Cube(randomNumber);
            t2.start();
            t3.start();
            try {
                Thread.sleep(1000);
                System.out.println();                
            } catch (Exception e) {
                System.out.println(e);
            }            
        }
    }
}

class Square extends Thread{
    int num;
    Square(int n){
        this.num = n;
    }
    public void run(){
        System.out.println("Square of " + num + " : " + num*num);
    } 
}

class Cube extends Thread{
    int num;
    Cube(int n){
        this.num = n;
    }
    public void run(){
        System.out.println("Cube of " + num + " : " + num*num*num);
    }    
}

class random{
    public static void main(String[] args) {        
        Number t1 = new Number();   
        t1.start();   
    }
}