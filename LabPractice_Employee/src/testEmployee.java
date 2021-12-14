import java.util.Scanner;

public class testEmployee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salary[] = new double[3];
		String department[] = new String[3];

		System.out.println("Enter 3 employees' salaries and departments: ");

		for (int i = 0; i < 3; i++) {
			salary[i] = input.nextDouble();
			department[i] = input.next();

		}
		Employee e1 = new Employee(salary[0], department[0], null);
		Employee e2 = new Employee(salary[1], department[1], null);
		Employee e3 = new Employee(salary[2], department[2], null);

		for (int i = 1; i < 4; i++) {
			System.out.print("Enter the first employee yearly performance " + i + ":");
			e1.yearlyRaise(input.nextDouble());
		}
		e2.changeManager(e1);
		e3.changeManager(e1);

		System.out.print("Enter the second employee yearly performance:");
		e2.yearlyRaise(input.nextDouble());
		System.out.print("Enter the third employee yearly performance:");
		e3.yearlyRaise(input.nextDouble());

		System.out.println("The first employee: " + e1.toString());
		System.out.println("The second employee: " + e2.toString());
		System.out.println("The third employee: " + e3.toString());

	}

}
