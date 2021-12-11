import java.util.Scanner;
public class Fuel {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the driving distance: ");
    double distance = input.nextDouble();
    System.out.print("Enter kilos per liter: ");
    double kpl = input.nextDouble();
    System.out.print("Enter price per liter: ");
    double ppl = input.nextDouble();
    
    double cost = (distance/kpl)*ppl;
    System.out.print("The cost of driving is $"+cost);
    
	}

}
