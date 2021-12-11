import java.util.Scanner;

public class testCafe {

	public static void main(String[] args) {
		int option = 0;
		double t = 0;
		Scanner input = new Scanner(System.in);
		Cafe c1 = new Cafe(5.5, 100, 3.5, 100, 2.25, 50, 10);
		do {
			System.out.println("**********************************************************************");
			System.out.println("*                    Welcome to Cafe :)                              *");
			System.out.println("*                ---------------------------                         *");
			System.out.println("*     Please enter one of the following options:                     *");
			System.out.println("*     1) order ==> this allows you to order a game                   *");
			System.out.println("*     2) quit ==> to end this program                                *");
			System.out.println("*                                                                    *");
			System.out.println("**********************************************************************");
			System.out.print("Enter your option :> ");
			option = input.nextInt();
			if (option == 1) {
				System.out.print("Please, enter order (#cups of coffee, #cups of tea and #donuts: ");
				c1.order(input.nextInt(), input.nextInt(), input.nextInt());
				t += c1.getTotal();
			}

		} while (option != 2);

	}

}
