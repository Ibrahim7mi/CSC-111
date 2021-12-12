
public class Fan {
	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	public int speed = SLOW;
	public boolean on = false;
	public double radius = 5;
	public String color = "blue";
	private String status = "off";

	public void turnOn() {
		on = true;
		status = "on";
	}

	public void turnOff() {
		on = false;
		status = "off";
	}

	public void increaseSpeed() {
		if (speed == FAST)
			System.out.println("Fan is already running at highest speed.");
		else if (speed == MEDIUM)
			speed = FAST;
		else
			speed = MEDIUM;

	}

	public void decreaseSpeed() {
		if (speed == SLOW)
			System.out.println("Fan is already running at lowest speed.");
		else if (speed == FAST)
			speed = MEDIUM;
		else
			speed = SLOW;

	}
 //f
	public void changeSpeed(int speed) {
		if (speed >= 1 && 3 <= speed) {
			switch (speed) {
			case 1:
				this.speed = SLOW;
				break;
			case 2:
				this.speed = MEDIUM;
				break;
			case 3:
				this.speed = FAST;
			}
		} else
			System.out.print("Incorrect speed value.");
	}

	public void changeColor(String color) {
		this.color = color;
	}

	public void changeRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "speed " + speed + "\ncolor " + color + "\nradius " + radius + "\nfan is " + status;
	}

}
