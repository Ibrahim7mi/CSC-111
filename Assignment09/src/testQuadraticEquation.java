import java.util.Scanner;

public class testQuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuadraticEquation q1 = new QuadraticEquation();

		System.out.print("Enter a, b, c: ");
		q1.a = input.nextDouble();
		q1.b = input.nextDouble();
		q1.c = input.nextDouble();

		if (q1.calcDiscriminant() < 0)
			System.out.println("The equation has no roots.");
		else {
			if (q1.calcDiscriminant() == 0)
				System.out.println("The root is " + q1.calcRoot1());
			else
				System.out.println("The roots are " + q1.calcRoot1() + " and " + q1.calcRoot2());
		}

	}

}
