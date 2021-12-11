
public class Cafe {
	private double coffeePrice, teaPrice, donutPrice, discount, subtotal, discountedPrice,
			total;
	private int coffeeTotQty, teaTotQty, donutQty;
	
	private void calculateSubTotal(coffeeTotQty, teaTotQty, donutTotQty) {
		subtotal = coffeeQty*coffeePrice + teaQty*teaPrice + donutQty*donutPrice;
	}
	private void calculateTotal(int coffeeQty, int teaQty, int donutQty) {
		total = calculateSubtotal(coffeeQty, teaQty, donutQty) + discount;
	}

}
