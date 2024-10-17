import java.util.*;

class printEven extends Thread {
    int sumEven = 0, randomNumber;

    printEven(int n) {
        this.randomNumber = n;
    }

    public void run() {
        for (int i = 1; i < randomNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number : " + i);
                sumEven += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class printOdd extends Thread {
    int num, sumOdd = 0;

    printOdd(int n) {
        this.num = n;
    }

    public void run() {
        for (int i = 1; i < num; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number : " + i);
                sumOdd += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class printSum extends Thread {
    int sum1, sum2;

    printSum(int sum1, int sum2) {
        this.sum1 = sum1;
        this.sum2 = sum2;
    }

    public void run() {
        System.out.println("Sum of even numbers: " + sum1);
        System.out.println("Sum of odd numbers: " + sum2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class numthread {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(50);
        printEven t1 = new printEven(randomNumber);
        printOdd t2 = new printOdd(randomNumber);
        
        t1.start();

        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        printSum t3 = new printSum(t1.sumEven, t2.sumOdd);
        t3.start();
    }
}