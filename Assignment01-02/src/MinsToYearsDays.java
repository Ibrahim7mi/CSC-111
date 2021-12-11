import java.util.Scanner;

public class MinsToYearsDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of minutes: ");

		int min = input.nextInt();

		int years = min / 525600;
		int remainingYears = min % 525600;
		int days = remainingYears / 1440;

		System.out.print(min + " minutes is approximately " + years + " years and " + days + " days");

	}

}
