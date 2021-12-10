
public class Ball {

	private double x, y, distTraveledX, distTraveledY;
	private static double totDistXAllBalls, totDistYAllBalls;
	public static double lastX, lastY;
	
	public Ball() {
		x = 0;
		y = 0;
		distTraveledX = 0;
		distTraveledY = 0;
	}
	
	public Ball(double newX, double newY) {
		x = newX;
		y = newY;
		distTraveledX = 0;
		distTraveledY = 0;
	}
	
	public double getX() { 
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void move(double xDisp, double yDisp) {
		if ((x + xDisp) == lastX && (y + yDisp) == lastY)
			System.out.println("Ball can't move!");
		
		else {
		x += xDisp;
		y += yDisp;
		distTraveledX += Math.abs(xDisp);
		distTraveledY += Math.abs(yDisp);
		totDistXAllBalls += Math.abs(xDisp);
		totDistYAllBalls += Math.abs(yDisp);
		lastX = x;
		lastY = y;
		}
	}
	
	public double getDistTraveledX() {
		return distTraveledX;
	}

	public double getDistTraveledY() {
		return distTraveledY;
	}
	
	public double getTotDistXAllBalls() {
		return totDistXAllBalls;
	}
	
	public double getTotDistYAllBalls() {
		return totDistYAllBalls;
	}
	
	public String toString() {
		return "Ball @ ("+x+","+y+")";
	}
	
}
