import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000:");
		int number = input.nextInt();
		
		int lastDigit = number % 10;
		int remainingNumber = number / 10;
		int secondLastDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int thirdLastDigit = remainingNumber % 10;
		
		int sum = lastDigit + secondLastDigit + thirdLastDigit;
		
		System.out.print("The sum of all digits in " + number + " is " + sum);

	}

}
