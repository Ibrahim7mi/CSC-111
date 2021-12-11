import java.util.Scanner;

public class GameStore2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id = 0;
		double subTotal = 0;
		double total = 0;
		int numOfGames = 0;
		double discount = 0;

		System.out.println("Welcome to Gaming Center :).");
		System.out.print("Please, enter game id: ");
		id = input.nextInt();

		while (id != -1) {
			System.out.print("Please, enter the price of next game: ");
			double price = input.nextDouble();
			System.out.print("Please, enter game id: ");
			id = input.nextInt();
			subTotal += price;
			numOfGames++;
		}

		if (numOfGames > 2) {
			discount = subTotal * (20.0 / 100);
			total = subTotal - discount;
		} else
			total = subTotal;

		System.out.println("Total price before discount: " + subTotal + "SR");
		System.out.println("Your discount is: " + discount + "SR");
		System.out.println("Total price after discount: " + total + "SR");
	}

}
