import java.util.*;

abstract class Questions{
    abstract String getQuestion();
    abstract int getSolution();
}

class TrueOrFalseQuestion extends Questions{
    String ques; int mySolution;
    TrueOrFalseQuestion(String q, int mySolution){
     this.ques = q; this.mySolution = mySolution;
    }
    String getQuestion(){
        return ques;
    };
    int getSolution(){
        return mySolution;
    };
}


class MultipleChoiceQuestion extends Questions{
    String ques; int mySolution;
    MultipleChoiceQuestion(String q, int mySolution){
        this.ques = q; this.mySolution = mySolution;
       }
    String getQuestion(){
        return ques;
    };
    int getSolution(){
        return mySolution;     
    };
}

class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans1, ans2; int total1=0;
        TrueOrFalseQuestion q1 = new TrueOrFalseQuestion("Penguins are capable of flight",2);
        do{
            System.out.println(q1.ques + "\nEnter your answer(1=T or 2=F) :");
            ans1 = sc.nextInt();
            if(ans1 != 1 && ans1 != 2){
                System.out.println("Enter a valid input!!");
            }
        }
        while(ans1 != 1 && ans1 != 2);
        if(ans1 == q1.getSolution()){
            System.out.println("Correct answer!!");
            total1 += 20;
        }
        else{
            System.out.println("Incorrect answer!!");            
        }

        TrueOrFalseQuestion q2 = new TrueOrFalseQuestion("The Statue of Liberty was a gift from France to the United States",1);
        do{
            System.out.println(q2.ques + "\nEnter your answer(1=T or 2=F) :");
            ans2 = sc.nextInt();
            if(ans2 != 1 && ans2 != 2){
                System.out.println("Enter a valid input!!");
            }
        }
        while(ans2 != 1 && ans2 != 2);
        if(ans2 == q2.getSolution()){
            System.out.println("Correct answer!!");
            total1 += 20;
        }
        else{
            System.out.println("Incorrect answer!!");
        }
        
        TrueOrFalseQuestion q3 = new TrueOrFalseQuestion("Venus is the hottest planet in our solar system",1);
        do{
            System.out.println(q2.ques + "\nEnter your answer(1=T or 2=F) :");
            ans2 = sc.nextInt();
            if(ans2 != 1 && ans2 != 2){
                System.out.println("Enter a valid input!!");
            }
        }
        while(ans2 != 1 && ans2 != 2);
        if(ans2 == q2.getSolution()){
            System.out.println("Correct answer!!");
            total1 += 20;
        }
        else{
            System.out.println("Incorrect answer!!");
        }

        System.out.println("Total points scored in True or False Round : " + total1);
        System.out.println("Out of : " + 60);


    }
}