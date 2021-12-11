
public class Cafe {
	private double coffeePrice, teaPrice, donutPrice, discount, subTotal, discountedPrice, total;
	private int coffeeTotQty, teaTotQty, donutTotQty;

	public Cafe() {

	}

	public Cafe(double cofep, int cofeqt, double teap, int teaqt, double donutp, int donutqt, int dis) {
		setCoffeePrice(cofep);
		setCoffeeQty(cofeqt);
		setTeaPrice(teap);
		setTeaQty(teaqt);
		setDonutPrice(donutp);
		setDonutQty(donutqt);
		setDiscount(dis);

	}

	public void setCoffeePrice(double coffeePrice) {
		if (coffeePrice < 0)
			coffeePrice *= -1;
		this.coffeePrice = coffeePrice;
	}

	public double getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeeQty(int coffeeQty) {
		if (coffeeQty < 0)
			coffeeQty *= -1;
		this.coffeeTotQty = coffeeQty;
	}

	public double getCoffeeQty() {
		return coffeeTotQty;
	}

	public void setTeaPrice(double teaPrice) {
		if (teaPrice < 0)
			teaPrice *= -1;
		this.teaPrice = teaPrice;
	}

	public double getTeaPrice() {
		return teaPrice;
	}

	public void setTeaQty(int teaQty) {
		if (teaQty < 0)
			teaQty *= -1;
		this.teaTotQty = teaQty;
	}

	public double getTeaQty() {
		return teaTotQty;
	}

	public void setDonutPrice(double donutPrice) {
		if (donutPrice < 0)
			donutPrice *= -1;
		this.donutPrice = donutPrice;
	}

	public double getDonutPrice() {
		return donutPrice;
	}

	public void setDonutQty(int donutQty) {
		if (donutQty < 0)
			donutQty *= -1;
		this.donutTotQty = donutQty;
	}

	public double getDonutQty() {
		return donutTotQty;
	}

	public void setDiscount(double dis) {
		if (dis < 0)
			dis *= -1;
		this.discount = dis / 100;
	}

	public double getDiscount() {
		return discount;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public double getTotal() {
		return total;
	}

	public double getDiscountedPrice() {
		return discountedPrice = subTotal * getDiscount();
	}

	private double calculateSubTotal(int coffeeQty, int teaQty, int donutQty) {
		return subTotal = coffeeQty * getCoffeePrice() + teaQty * getTeaPrice() + donutQty * getDonutPrice();
	}

	private double calculateTotal(int coffeeQty, int teaQty, int donutQty) {

		return total = calculateSubTotal(coffeeQty, teaQty, donutQty) - discountedPrice;
	}

	public double order(int coffeeQty, int teaQty, int donutQty) {
		if (getCoffeeQty() < coffeeQty || getTeaQty() < teaQty || getDonutQty() < donutQty) {
			System.out.println("Error: not enough cups and/or donuts");
			return 0;
		} else {
			calculateTotal(coffeeQty, teaQty, donutQty);
			display(coffeeQty, teaQty, donutQty);
			return total;
		}

	}

	public void display(int coffeeQty, int teaQty, int donutQty) {
		System.out.print("--------------------------------------------------------\n");
		System.out.print("Item                  Quantity                     Price\n");
		System.out.print("--------------------------------------------------------\n");
		System.out.print("coffee                    " + coffeeQty + "                        "
				+ coffeeQty * getCoffeePrice() + "\n");
		System.out.print(
				"tea                       " + teaQty + "                        " + teaQty * getTeaPrice() + "\n");
		System.out.print("donut                     " + donutQty + "                        "
				+ donutQty * getDonutPrice() + "\n");
		System.out.print("--------------------------------------------------------\n");
		System.out.print("sub total " + getSubTotal() + "\n");
		System.out.print("Discount (%" + getDiscount() * 100 + ") " + getDiscountedPrice() + "\n");
		System.out.print("--------------------------------------------------------\n");
		System.out.print("total " + getTotal() + "\n");
		System.out.print("--------------------------------------------------------\n");

	}

}
