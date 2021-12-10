import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter course name: ");
		String course = input.next();
		
		Student s1 = new Student();
		s1.name = "Saleh";
		s1.age = 22;
		s1.GPA = 4.25;
		s1.course = course;
		
		Student s2 = new Student();
		s2.name = "Ali";
		s2.age = 25;
		s2.GPA = 3.75;
		s2.course = course;
		
		s1.StudentInfo();
		System.out.println("-----------------------");
		s2.StudentInfo();
	}

}
