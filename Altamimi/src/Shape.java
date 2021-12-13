// Ibrahim Altamimi
// 442102395
// Section 10:00am - 11:50am

import java.util.Scanner;

public class Shape {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		char c;

		do {
			System.out.println("Please enter: ");
			System.out.print("A number > ");
			n = input.nextInt();
			if (n != -1) {
				System.out.print("A char > ");
				c = input.next().charAt(0);

				System.out.println("The square is: ");

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
							System.out.print(c);
						} else {
							System.out.print(" ");
						}
					}
					System.out.println("");
				}
			}

		} while (n != -1);

		System.out.println("Goodbye!");

	}

}
