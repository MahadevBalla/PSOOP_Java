import java.util.*;

abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    double m1[];
    A(double m1[]){
        this.m1=m1;
    }  

    double getPercentage(){
        return (m1[0]+m1[1]+m1[2])/3;
    }

    double[] sort(double arr[]){
        double indices[] = new double[3];
        for (int i = 0; i < arr.length - 1; i++){
          for (int j = 0; j < arr.length - i - 1; j++){
            if (arr[j] > arr[j + 1]){
              indices[j] = j+1;  
              double temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
          }
        }
        return indices;
    }
}

class B extends Marks{
    double m2[];
    B(double m2[]){
        this.m2=m2;
    } 

    double getPercentage(){
        return (m2[0]+m2[1]+m2[2]+m2[3])/4;
    }

    double[] sort(double arr[]){
        double indices[] = new double[4];
        for (int i = 0; i < arr.length - 1; i++){
          for (int j = 0; j < arr.length - i - 1; j++){
            if (arr[j] > arr[j + 1]){
              indices[j] = j+1;  
              double temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
          }
        }
        return indices;
    }
}

class stud{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m1[] = new double[3];
        double m2[] = new double[4];
        System.out.println("Enter marks of student A -");
        do{
            System.out.print("Subject 1 : ");
            m1[0] = sc.nextDouble();
            if(m1[0]<0 || m1[0]>100){
                System.out.println("Enter a valid input!!");
            }
        }
        while(m1[0]<0 || m1[0]>100);
        do{
            System.out.print("Subject 2 : ");
            m1[1] = sc.nextDouble();
            if(m1[1]<0 || m1[1]>100){
                System.out.println("Enter a valid input!!");
            }
        }
        while(m1[1]<0 || m1[1]>100);
        do{
            System.out.print("Subject 3 : ");
            m1[2] = sc.nextDouble();
            if(m1[2]<0 || m1[2]>100){
                System.out.println("Enter a valid input!!");
            }
        }
        while(m1[2]<0 || m2[2]>100);
        A a = new A(m1);
        
        System.out.println("Enter marks of student B -");
        do{
            System.out.print("Subject 1 : ");
            m2[0] = sc.nextDouble();
            if(m2[0]<0 || m2[0]>100){
                System.out.println("Enter a valid input!!");
            }
        }
        while(m2[0]<0 || m2[0]>100);
        do{
            System.out.print("Subject 2 : ");
            m2[1] = sc.nextDouble();
            if(m2[1]<0 || m2[1]>100){
                System.out.println("Enter a valid input!!");
            }
        }
        while(m2[1]<0 || m2[1]>100);
        do{
            System.out.print("Subject 3 : ");
            m2[2] = sc.nextDouble();
            if(m2[2]<0 || m2[2]>100){
                System.out.println("Enter a valid input!!");
            }
        }
        while(m2[2]<0 || m2[2]>100);
        do{
            System.out.print("Subject 4 : ");
            m2[3] = sc.nextDouble();
            if(m2[3]<0 || m2[3]>100){
                System.out.println("Enter a valid input!!");
            }
        }
        while(m2[3]<0 || m2[3]>100);
        B b = new B(m2);

        double sub1[] = a.sort(m1);
        double sub2[] = b.sort(m2);

        if(a.getPercentage()>b.getPercentage()){
            System.out.println("Percentage of marks scored by -");
            System.out.println("Student A : " + a.getPercentage() + "%");
            System.out.println("Student B : " + b.getPercentage() + "%");
            System.out.println("Student A has scored higher in terms of percentage!!");
            System.out.println("Marks in highest order -\nMarks of student A -");
            for(int i=2; i>=0;i--){
                //System.out.println("Subject " + (int)(sub1[i]+1) + " : " + m1[i]);
                System.out.println(m1[i]);
            }
            System.out.println("Marks of student B -");
            for(int i=3; i>=0;i--){
                //System.out.println("Subject " + (int)(sub2[i]+1) + " : " + m2[i]);
                System.out.println(m2[i]);
            }           
        }
        else if(a.getPercentage() == b.getPercentage()){
            System.out.println("Both students have scored equal marks in terms of percentage(" + a.getPercentage() + "%)!!");
            System.out.println("Marks in highest order -\nMarks of student A -");
            for(int i=2; i>=0;i--){
                //System.out.println("Subject " + (int)(sub1[i]+1) + " : " + m1[i]);
                System.out.println(m1[i]);
            }
            System.out.println("Marks of student B -");
            for(int i=3; i>=0;i--){
                //System.out.println("Subject " + (int)(sub2[i]+1) + " : " + m2[i]);
                System.out.println(m2[i]);
            }
        }
        else{
            System.out.println("Percentage of marks scored by -");
            System.out.println("Student A : " + a.getPercentage() + "%");
            System.out.println("Student B : " + b.getPercentage() + "%");
            System.out.println("Student B has scored higher in terms of percentage!!");
            System.out.println("Marks in highest order -\nMarks of student B -");
            for(int i=3; i>=0;i--){
                //System.out.println("Subject " + (int)(sub2[i]+1) + " : " + m2[i]);
                System.out.println(m2[i]);
            }
            System.out.println("Marks of student A -");
            for(int i=2; i>=0;i--){
                //System.out.println("Subject " + (int)(sub1[i]+1) + " : " + m1[i]);
                System.out.println(m1[i]);
            }   
        }
    }
}