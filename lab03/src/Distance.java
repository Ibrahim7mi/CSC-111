import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter x1 and y1:");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	
	System.out.print("Enter x2 and y2:");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	
	double Xs = Math.pow(x2-x1,2);
	double Ys = Math.pow(y2-y1,2);
	
	double Distance = Math.pow(Xs+Ys,0.5);
	System.out.print("The distance between the two points is "+ Distance);
	

	}

}
