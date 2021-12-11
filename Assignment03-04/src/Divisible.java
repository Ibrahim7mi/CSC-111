import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int num = input.nextInt();
     
     System.out.print("Is "+num+" dividible by 5 and 6? ");
     if (num%5 == 0 && num%6 == 0) 
     System.out.print(true);
     else System.out.print(false);
     
     
     System.out.print("\r\nIs "+num+" divisible by 5 or 6? ");
     if (num%5 == 0 || num%6 == 0) 
         System.out.print(true);
         else System.out.print(false);
     
     
     System.out.print("\r\nIs "+num+" divisible by 5 or 6, but not both? ");
     if (num%5 == 0) 
    	 if (num%6 == 0)
    		 System.out.print(false);
    	 else 
    		 System.out.print(true);
     else
    	 if (num%6 == 0)
    		 System.out.print(true);
    	 else System.out.print(false);
     
	}

}
