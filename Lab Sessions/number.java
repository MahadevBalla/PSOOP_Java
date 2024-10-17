import java.util.*;

class PrimeThread extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime Number : " + i + "      ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeThread extends Thread {
    public void run() {
        for (int i = 10; i <= 600; i++) {
            if (isPalindrome(i)) {
                System.out.println("Palindrome Number : " + i + "      ");
            }
        }
        System.out.println();
    }

    private boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}

public class number {
    public static void main(String[] args) {
        
        System.out.println("Sequential Execution : ");
        PrimeThread primeThread = new PrimeThread();
        PalindromeThread palindromeThread = new PalindromeThread();
        primeThread.start();
        try {
            primeThread.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        palindromeThread.start();
        
        
        System.out.println("\nParallel Execution:");
        PrimeThread parallelPrimeThread = new PrimeThread();
        PalindromeThread parallelPalindromeThread = new PalindromeThread();
        parallelPrimeThread.start();
        parallelPalindromeThread.start();
    }
}
