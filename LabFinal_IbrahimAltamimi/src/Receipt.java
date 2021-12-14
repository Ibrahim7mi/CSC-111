// Ibrahim Altamimi
// 442102395
// Section 10:00am - 11:50am

public class Receipt {
	private String names[];
	private int quantities[];
	private double prices[];
	private int nItems;
	public final int MAX_SIZE = 100;

	public Receipt() {
		nItems = 0;
		names = new String[MAX_SIZE];
		quantities = new int[MAX_SIZE];
		prices = new double[MAX_SIZE];

	}

	public int getNItems() {
		return nItems;
	}

	public boolean addItem(String name, int quantity, double price) {
		if (quantity <= 0 && names.length == MAX_SIZE) {
			System.out.println("item was not added!");
			return false;
		} else {
			names[nItems] = name;
			quantities[nItems] = quantity;
			prices[nItems] = price;
			nItems++;
			System.out.println("item was added!");
			return true;
		}

	}

	public int findItemByName(String name) {
		for (int i = 0; i < nItems; i++) {
			if (names[i].equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}

	public boolean displayItem(int i) {
		if (i < 0 || i > nItems)
			return false;
		else {
			System.out.println(names[i] + ", " + "x" + quantities[i] + ", " + prices[i] + "SR");
			return true;
		}

	}

	public void printReceipt() {
		double total = 0;
		for (int i = 0; i < nItems; i++) {
			System.out.println(names[i] + ", " + "x" + quantities[i] + ", " + prices[i] + "SR");
			total += quantities[i] * prices[i];
		}
		System.out.println("=====================");

		System.out.println("Total: " + total);
		System.out.println("=====================");
	}

}
