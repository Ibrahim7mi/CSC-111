
public class LargestN {

	public static void main(String[] args) {
		int limit = 12000;
		int x = 0;
		int save = 0;
		double y = 0;
		while (y < limit) {
			y = Math.pow(x, 3);
			save = x;
			x++;
		}

		System.out.print("This number is " + save);

	}

}
