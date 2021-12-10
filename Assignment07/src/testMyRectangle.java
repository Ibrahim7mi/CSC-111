import java.util.Scanner;

public class testMyRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyRectangle r1 = new MyRectangle();
		MyRectangle r2 = new MyRectangle();
		r1.width = 4;
		r1.height = 8;
		r1.area = r1.width * r1.height;
		r1.perimeter = r1.width * 2 + r1.height * 2;
		r2.width = 3.5;
		r2.height = 35.9;
		r2.area = r2.width * r2.height;
		r2.perimeter = r2.width * 2 + r2.height * 2;

		System.out.println(
				"The area of a rectangle with width " + r1.width + " and height " + r1.height + " is " + r1.area);
		System.out.println("The perimeter of the rectangle is " + r1.perimeter);
		System.out.println(
				"The area of a rectangle with width " + r2.width + " and height " + r2.height + " is " + r2.area);
		System.out.println("The perimeter of the rectangle is " + r2.perimeter);
		r1.printRectangle();
	}

}
