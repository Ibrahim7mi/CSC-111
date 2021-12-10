import java.util.Scanner;
public class Unique {
	
	public void getNumbers() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many numbers you want to input: ");
		int size = input.nextInt();
		while (size <= 0) {
			System.out.print("Invalid size. Enter new size: ");
			size = input.nextInt();
		}
		
		int numbers[] = new int[size];
		int count = 0;
		int entered = 0;
		
		while(count < numbers.length) {
			System.out.print("\nEnter number: ");
			int num = input.nextInt();
			entered++;
			
			if(num >= 10 && num <= 100) {
				boolean unique = true;
				for(int i = 0; i < count; i++) {
					if(num == numbers[i]) 
						unique = false;
				}
				if(unique) {
					numbers[count] = num;
					count++;
				}
				else System.out.println(num + " has already been entered.");
			}
			else System.out.println("number must be between 10 and 100.");
			
			for(int i = 0; i < count; i++) {
				System.out.println(numbers[i]);
			}	
		}	
	}
	
}
