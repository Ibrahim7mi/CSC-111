import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number (-1 to end): ");
		int number = input.nextInt();

		while (number != -1) {
			int i = 1;

			while (number > 0) {
				int num = number % 10;
				System.out.println("Digit" + i++ + " = " + num);
				number = number / 10;
			}

			System.out.print("\nEnter a number (-1 to end): ");
			number = input.nextInt();
		}

	}

}
