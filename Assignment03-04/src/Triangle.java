import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three edges (length in double): ");

		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		double perimeter = edge1 + edge2 + edge3;

		if (edge1 + edge2 < edge3 || edge3 + edge2 < edge1 || edge1 + edge3 < edge2)
			System.out.print("Input is invalid");

		else
			System.out.print("The perimeter is " + perimeter);

	}

}
