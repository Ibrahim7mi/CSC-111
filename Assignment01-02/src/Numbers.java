import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");

		int firstDigit = input.nextInt();
		int secondDigit = input.nextInt();
		int thirdDigit = input.nextInt();

		int sum = firstDigit + secondDigit + thirdDigit;
		int mult = firstDigit * secondDigit * thirdDigit;
		double avr = (firstDigit + secondDigit + thirdDigit) / 3.0;
		double pow = Math.pow(firstDigit, secondDigit);

		System.out.print("Sum = " + sum + "\r\nMult = " + mult + "\r\nAvr = " + avr + "\r\nPow = " + pow);

	}

}
