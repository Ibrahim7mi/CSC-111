package lab04;

import java.util.Scanner;

public class CountPosNeg {

	public static void main(String[] args) {
		int CountPositive = 0;
		int CountNegitive = 0;
		int total = 0;
		int count = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers ending with 0: ");
		int num = input.nextInt();

		while (num != 0) {
			if (num > 0)
				CountPositive++;
			else
				CountNegitive++;

			total += num;
			count++;

			num = input.nextInt();
		}
		if (count == 0)
			System.out.println("no numbers entered except 0");
		else {
			System.out.println("The number of positives is " + CountPositive);
			System.out.println("The number of negitives is " + CountNegitive);
			System.out.println("The total is " + total);
			System.out.println("The average is " + (total * 1.0 / count));
		}

	}

}
