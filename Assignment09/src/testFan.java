
public class testFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.changeSpeed(3);
		fan1.radius = 10;
		fan1.color = "yellow";
		fan1.turnOn();
		fan1.increaseSpeed();

		Fan fan2 = new Fan();
		fan2.changeSpeed(2);
		fan2.radius = 5;
		fan2.turnOn();
		fan2.decreaseSpeed();
		fan2.decreaseSpeed();
		fan2.turnOff();

		System.out.println("-------------\nFan1:\n" + fan1.toString());
		System.out.println("-------------\nFan2:\n" + fan2.toString());

	}

}
