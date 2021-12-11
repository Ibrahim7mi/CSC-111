import java.util.Scanner;

public class GameStore3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String option;
		int id;
		double subTotal = 0;
		double total = 0;
		int numOfGames = 0;
		double discount = 0;
		int sales = 0;
		do {
			System.out.println("**********************************************************************");
			System.out.println("*                       Welcome to Gaming Center :)                  *");
			System.out.println("*                       ---------------------------                  *");
			System.out.println("*       Please enter one of the following options:                   *");
			System.out.println("*       1) add  ==> this allows you to add a game to inventory       *");
			System.out.println("*       2) sell ==> this allows you to sell games to a customer      *");
			System.out.println("*       3) exit ==> to end this program                              *");
			System.out.println("*                                                                    *");
			System.out.println("**********************************************************************");

			option = input.next();
			if (option.equals("sell")) {
				System.out.print("Please, enter game id (-1 to end): ");
				id = input.nextInt();

				while (id != -1) {
					System.out.print("Please, enter the price of next game: ");
					double price = input.nextDouble();
					System.out.print("Please, enter game id: ");
					id = input.nextInt();
					subTotal += price;
					sales++;
					--numOfGames;
				}

				if (sales > 2) {
					discount = subTotal * (20.0 / 100);
					total = subTotal - discount;
				} else
					total = subTotal;
			}

		} while (!option.equals("exit"));
	}

}
