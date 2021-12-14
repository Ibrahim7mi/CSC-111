
// Ibrahim Altamimi 
// 442102395
// Section 10:00am - 11:50am
import java.util.Scanner;

public class TestReceipt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Receipt r1 = new Receipt();
		boolean condition = true;

		do {
			System.out.println("**********************************************************************");
			System.out.println("Welcome :)");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Please enter one of the following options:");
			System.out.println("1) add ==> this allows you to add an item to the receipt\r\n"
					+ "2) print ==> this allows you to print receipt.\r\n"
					+ "3) find ==> this allows you to search for an item name.\r\n"
					+ "4) exit ==> to end this program ");
			System.out.println("**********************************************************************");
			System.out.print("Enter your option :>");

			switch (input.next().toLowerCase()) {
			case "add":
				System.out.println("Enter item name, quantity and price.");
				r1.addItem(input.next(), input.nextInt(), input.nextDouble());

				break;
			case "print":
				r1.printReceipt();

				break;
			case "find":
				System.out.print("Please enter the item name: ");
				if (r1.findItemByName(input.next()) == -1)
					System.out.println("Item was not found.");
				else
					r1.findItemByName(input.next());

				break;
			case "exit":
				System.out.println("Thanks! Goodbye :) ");
				condition = false;

				break;
			default:
				System.out.println("Wrong input! Please try again");
				break;

			}

		} while (condition);
	}

}
