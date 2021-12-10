import java.util.Scanner;
public class GameStore1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Gaming Center :).");
		System.out.print("Please, enter game id: ");
		int GameId = input.nextInt();
		System.out.print("Please, enter the price of a game: ");
		double price = input.nextDouble();
		System.out.print("Please, enter the number of games: ");
		double NumberOfGames = input.nextDouble();
		
		double total = 0;
		if(NumberOfGames < 1)
			System.out.println("Error");
		else {
			
			total = price*NumberOfGames;
			if(NumberOfGames > 2) {
			double discount = (20.0/100);
		     total -= discount*total; }
			
		}
		System.out.print("Total price for game " + GameId + " is: " + total + "SR");

	}

}
