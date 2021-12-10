import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();
		
		
		for(int i=1; i <= numberOfLines; i++) {
			
			for(int j=0; j<=(numberOfLines-i); j++) {
				if (j==(numberOfLines-i))
					System.out.print("  ");
				else
					System.out.print("   ");
			}
			for(int j=i; j >= 1; j--) {
					System.out.print(j + "  ");
			}
			for(int j=2; j < i+1; j++) {
				System.out.print(j + "  ");
			}
			
		System.out.println("");
		}

	}

}
