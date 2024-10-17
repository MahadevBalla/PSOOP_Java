import java.util.*;

abstract class Marks{
    private ArrayList<Double> marks = new ArrayList<>();
    ArrayList<Double> getMarks(){
        return marks;
    }
    abstract double getPercentage();
}

class A extends Marks{
    private ArrayList<Double> marks = new ArrayList<>();

    A(ArrayList<Double> marks){
        this.marks = marks;
    }

    @Override
    double getPercentage(){
        double total=0;
        for (int i=0; i<marks.size() ;i++){
            total += marks.get(i);
        }
        return total/marks.size();
    }

    ArrayList<Double> getMarks(){
        return marks;
    }
}

class B extends Marks {
    private ArrayList<Double> marks = new ArrayList<>();

    B(ArrayList<Double> marks){
        this.marks = marks;
    }

    @Override
    double getPercentage(){
        double total=0;
        for (int i=0; i<marks.size() ;i++) {
            total += marks.get(i);
        }
        return total/marks.size();
    }

    ArrayList<Double> getMarks(){
        return marks;
    }
}

public class stud{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temp;
        System.out.println("Enter marks for student A -");
        ArrayList<Double> marksA = new ArrayList<>();
        for (int i=0; i<3; i++){
            do{
                System.out.print("Subject " + (i+1) + " : ");
                temp = sc.nextDouble();               
                if(temp<0 || temp>100){
                    System.out.println("Enter a valid input!!");
                }
                else{
                    marksA.add(temp); 
                }
            }
            while(temp<0 || temp>100);            
        }

        System.out.println("Enter marks for student B -");
        ArrayList<Double> marksB = new ArrayList<>();
        for (int i=0; i<4; i++){
            do{
                System.out.print("Subject " + (i+1) + " : ");
                temp = sc.nextDouble();                
                if(temp<0 || temp>100){
                    System.out.println("Enter a valid input!!");
                }
                else{
                    marksB.add(temp);
                }
            }
            while(temp<0 || temp>100);
        }

        A a = new A(marksA);
        B b = new B(marksB);

        if(a.getPercentage() > b.getPercentage()){
            System.out.println("Student A has higher percentage: " + a.getPercentage());
            System.out.println("Marks of Student A -");
            displayMarks(a);
            System.out.println("Marks of Student B -");
            displayMarks(b);

        }
        else if(a.getPercentage() < b.getPercentage()){
            System.out.println("Student B has higher percentage: " + b.getPercentage());
            System.out.println("Marks of Student B -");
            displayMarks(b);
            System.out.println("Marks of Student A -");
            displayMarks(a);
        }
        else{
            System.out.println("Both students have the same percentage: " + b.getPercentage());
            System.out.println("Marks of Student A -");
            displayMarks(a);
            System.out.println("Marks of Student B -");
            displayMarks(b);
        }
    }

    private static void displayMarks(Marks student) {
        ArrayList<Double> marks = student.getMarks();
        ArrayList<Double> sortedMarks = new ArrayList<>(marks);
        Collections.sort(sortedMarks, Collections.reverseOrder());

        for (double mark : sortedMarks) {
            int index = marks.indexOf(mark) + 1;
            System.out.println("Subject " + index + " : " + mark);
        }
    }
}