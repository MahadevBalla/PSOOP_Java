import java.util.Scanner;
class Student{
	int rno;
	String name;
	int marks;
	Student(){
	}

	Student(int rno,String name,int marks){
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}

	static float findAverage(Student stu[]){
		float avg=0;
		for(Student s:stu)
			avg+=s.marks;
		avg/=stu.length;
		return avg;
	}
}

class TestStudent{
	public static void main(String []args){
		Student students[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<students.length;i++){
			System.out.println("Enter details of student " + (i+1));
			System.out.print("Roll number : ");
			int rno=sc.nextInt();
			sc.nextLine();
			System.out.print("Name : ");
			String name=sc.nextLine();
			System.out.print("Marks : ");
			int marks=sc.nextInt();
			students[i]=new Student(rno,name,marks);
		}
		System.out.println("Average marks scored : " + Student.findAverage(students));
	}
}