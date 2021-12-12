
public class Car {
	private int id;
	private String model;
	private int year;
	private double price;

	public Car() {
		setId(-1);
		setModel("NA");
		setYear(-1);
		setPrice(-1);
	}

	public Car(int id, String model, int year, double price) {
		setId(id);
		setModel(model);
		setYear(year);
		setPrice(price);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

}
