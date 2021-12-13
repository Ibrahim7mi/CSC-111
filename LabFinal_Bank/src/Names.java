import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter how many students: ");
		int n = input.nextInt();
		String first[] = new String[n];
		String last[] = new String[n];
		int count = 0;
		int ctr = 0;

		for (int i = 0; i < n; i++) {
			first[i] = input.next();
			last[i] = input.next();
		}
		System.out.println("The students are: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Student " + i + " : " + first[i] + last[i]);
		}
		for (int i = 0; i < n; i++) {
			if (first[i].equalsIgnoreCase("Mohammed"))
				count++;
		}
		System.out.println("There are " + count + " Students with first name Mohammed");

		System.out.println("The students with last name not beginning with Al are: ");
		for (int i = 0; i < n; i++) {
			if (!last[i].toLowerCase().startsWith("al")) {
				System.out.println("Student " + ctr + " : " + first[i] + " " + last[i]);
				ctr++;
			}
		}

	}

}
