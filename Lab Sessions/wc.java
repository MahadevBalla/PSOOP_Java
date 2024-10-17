class Welcome extends Thread{
    
    public void run(){
        while(true){
            System.out.println("Welcome to SPIT");
            CE t2 = new CE();
            synchronized(t2){
                t2.start();
            }
            
            try {
                Thread.sleep(200);
                System.out.println();                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }    
}

class CE extends Thread{
    public void run(){
        System.out.println("Computer Engineering Department");
    }    
}

public class wc {
    public static void main(String[] args) {
        Welcome t1 = new Welcome();
        t1.start();        
    }    
}