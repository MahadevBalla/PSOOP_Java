import java.util.*;

interface CharSequence {
    public String stringrev(String s);        
}

class RevCharSequence implements CharSequence{
    public String stringrev(String s){
        char arr[] = s.toCharArray();
        int length = arr.length;
        for(int i=0; i<length/2; i++){
            char temp = arr[length-1-i];
            arr[length-1-i] = arr[i];
            arr[i] = temp;
        }
        return new String(arr);
    }
}

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        RevCharSequence r = new RevCharSequence();
        System.out.println("Reversed String : " + r.stringrev(s));
    }    
}