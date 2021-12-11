import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		String TempName = "";
		int score = 0;
		int TempScore = 0;
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		for(int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter a student name: ");
			TempName = input.next();
			System.out.print("Enter a student score: ");
			TempScore = input.nextInt();
			
			if (TempScore > score) 
			{
				score = TempScore;
				name = TempName;
			 }		
			
		}
		System.out.print("Top student "+ name +"'s score is "+ score);	

	}

}
