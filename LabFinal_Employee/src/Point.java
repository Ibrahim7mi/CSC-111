
public class Point {
	private double x;
	private double y;

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(Point p) {
		double distance = Math.pow(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2), 0.5);
		return distance;
	}
	

}
