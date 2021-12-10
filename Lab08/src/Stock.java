public class Stock {
	
	private String symbol;
	private String name;
	private double currentPrice;
	private double previousClosingPrice;
	
	public void setSymbol(String s) {
		symbol = s;
	}
	public void setName(String n) {
		name = n;
	}
	public void setCurrentPrice(double cp) {
		currentPrice = cp;
	}
	public void setPreviousClosingPrice(double pcp) {
		previousClosingPrice = pcp;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public double getChangePercent() {
		double change = (currentPrice - previousClosingPrice);
		return (change/previousClosingPrice)*100;
	}

}

