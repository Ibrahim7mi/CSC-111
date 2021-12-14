import java.util.Scanner;

public class testPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Point p1 = new Point();
		Point p2 = new Point();
		do {
			System.out.print("Enter x and y for p1");
			p1.setX(input.nextDouble());
			p1.setY(input.nextDouble());

			System.out.print("Enter x and y for p2");
			p2.setX(input.nextDouble());
			p2.setY(input.nextDouble());

			if (p1.distance(p2) > 5.0)
				System.out.println("Disatance is " + p1.distance(p2) + " wich is > 5. Try again.");

		} while (p1.distance(p2) > 5.0);
		System.out.println("The to points are close.");
		System.out.println("Disatance is " + p1.distance(p2) + " wich is less than 5.");

	}

}
