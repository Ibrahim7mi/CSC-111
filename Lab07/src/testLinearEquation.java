import java.util.Scanner;

class linearEquation {
	
	public double a,b,c,d,e,f;
	
	public boolean isSolvable() {
		if ( a*b - b*c != 0)
			return true; 
		return false;
	}
	
	public double solveX() {
		return (e*d - b*f) / (a*d - b*c); 
	}
	
	public double solveY() {
		return (a*f - e*c) / (a*d - b*c);
	}
}


public class testLinearEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		linearEquation equation = new linearEquation();
				
		System.out.print("Enter a, b, c, d, e, f: ");
		equation.a = input.nextDouble();
		equation.b = input.nextDouble();
		equation.c = input.nextDouble();
		equation.d = input.nextDouble();
		equation.e = input.nextDouble();
		equation.f = input.nextDouble();
		
		if (equation.isSolvable())
			System.out.print("x is " + equation.solveX() + " and y is " + equation.solveY());
		else 
			System.out.print("The system has no solution");

	}

}

