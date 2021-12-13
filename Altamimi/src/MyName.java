// Ibrahim Altamimi
// 442102395
// Section 10:00am - 11:50am

import java.util.Scanner;

public class MyName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		boolean condition = false;
		int numberOfChar = 0;

		do {
			System.out.print("Enter a name: ");
			name = input.next();

			if (name.length() <= 5) {
				System.out.println("The name has 5 or less characters.");
			} else
				numberOfChar = name.length();

			if (name.charAt(0) != 'a') {
				System.out.println("The name doesn't start with 'a' ");
			} else
				condition = true;

		} while (!condition || numberOfChar <= 5);

		System.out.println("Accepted.");

	}

}
