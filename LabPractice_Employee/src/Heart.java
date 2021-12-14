import java.util.Scanner;

public class Heart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String status = "";
		String x = "";
		double y = 0;
		double totHB = 0;

		do {
			String tempStatus = "";
			System.out.print("Please enter patient HB ");
			int HB = input.nextInt();
			totHB += HB;
			if (HB > 120)
				tempStatus = "High";
			else if (80 <= HB && HB <= 120)
				tempStatus = "Normal";
			else if (HB < 80)
				tempStatus = "Low";

			x = status;
			status = tempStatus;
			y++;
			System.out.println("HB is " + status);

		} while (status != x || status == "Normal");

		System.out.println("HB is " + status + " twise in a row");
		System.out.println("The average HB is " + totHB / y);

	}

}
