
public class testBall {

	public static void main(String[] args) {

		Ball ball1 = new Ball(2, 2);
		ball1.move(3, -2);
		ball1.move(2, -7);

		Ball ball2 = new Ball();
		ball2.move(7, -7);
		ball2.move(2, 4);

		System.out.println(ball1.toString());
		System.out.println(ball2.toString());
		System.out.println("Total X = " + ball1.getTotDistXAllBalls());
		System.out.println("Total Y = " + ball1.getTotDistYAllBalls());

	}

}
