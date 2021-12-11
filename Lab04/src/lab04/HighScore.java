package lab04;

import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double HighestScore = 0;
		double SecondHighestScore = 0;
		double TempScore = 0;
		int count = 0;
		String HSname = "";
		String SHSname = "";

		System.out.print("Enter the number of students: ");
		int NumOfStudents = input.nextInt();

		while (NumOfStudents > count) {
			System.out.print("Enter a students name: ");
			String StudentName = input.next();
			System.out.print("Enter a students score: ");
			double score = input.nextInt();
			TempScore = score;

			if (TempScore > HighestScore) {
				HSname = StudentName;
				HighestScore = TempScore;
			} else if (TempScore > SecondHighestScore) {
				SHSname = StudentName;
				SecondHighestScore = TempScore;
			}

			count++;
		}
		System.out.println("Top two students: ");
		System.out.println(HSname + "'s score is " + HighestScore);
		System.out.println(SHSname + "'s score is " + SecondHighestScore);

	}

}
