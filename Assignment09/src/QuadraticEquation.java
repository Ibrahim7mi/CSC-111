
public class QuadraticEquation {
	public double a, b, c;

	public double calcDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public double calcRoot1() {
		return (-b + Math.pow(calcDiscriminant(), 0.5)) / 2 * a;
	}

	public double calcRoot2() {
		return (-b - Math.pow(calcDiscriminant(), 0.5)) / 2 * a;
	}

}
