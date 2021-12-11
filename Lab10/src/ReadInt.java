import java.util.Scanner;

public class ReadInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of ints you want to read: ");
		int N = input.nextInt();
		int a[] = new int[N];
		System.out.print("Enter the " + N + " numbers: ");

		for (int i = 0; i < N; i++) {
			a[i] = input.nextInt();
		}

		System.out.print("The numbers you entered are: ");
		for (int i = 0; i < N; i++)
			System.out.print(a[i] + " ");

	}

}
