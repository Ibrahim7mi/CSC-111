
public class CarDealer {
	private Car cars[];
	private int nCars;
	public final int MAX_SIZE = 100;

	public CarDealer() {
		cars = new Car[MAX_SIZE];
		nCars = 0;
	}
	public int getnCars() {
		return nCars;
	}
	
	public void findCar(int id) {
		return cars[id];
	}

}
