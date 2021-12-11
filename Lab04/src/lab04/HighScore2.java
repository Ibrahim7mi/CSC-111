package lab04;

import java.util.Scanner;

public class HighScore2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int NumberOfStudents = input.nextInt();

		System.out.print("Enter a student name: ");
		String name1 = input.next();
		System.out.print("Enter a student score: ");
		double score1 = input.nextDouble();
		System.out.print("Enter a student name: ");
		String name2 = input.next();
		System.out.print("Enter a student score: ");
		double score2 = input.nextDouble();

		if (score2 > score1) {
			String TempName = name1;
			double TempScore = score1;
			name1 = name2;
			score1 = score2;
			name2 = TempName;
			score2 = TempScore;
		}
		for (int i = 0; NumberOfStudents - 2 > i; i++) {
			System.out.print("Enter a student name: ");
			String name = input.next();
			System.out.print("Enter a student score: ");
			double score = input.nextDouble();
			if (score > score1) {
				String TempName = name1;
				double TempScore = score1;
				score1 = score;
				name1 = name;
				name2 = TempName;
				score2 = TempScore;
			} else if (score > score2) {
				name2 = name;
				score2 = score;
			}

		}

		System.out.println("Top two students: ");
		System.out.println(name1 + "'s score is " + score1);
		System.out.print(name2 + "'s score is " + score2);

	}

}
