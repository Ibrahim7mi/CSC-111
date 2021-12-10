
public class MyRectangle {
	public double width,height,area,perimeter;
	
	public void printRectangle() {
		for(int i=1; i <= (int)height; i++) {
			for(int j=1; j <= (int)width; j++) {
				System.out.print("*");
				}
			System.out.print("\n");
		}
	}

}
