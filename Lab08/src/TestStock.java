import java.util.Scanner;
public class TestStock {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stock stock1 = new Stock();
		
		System.out.print("Enter symbol of stock:");
		stock1.setSymbol(input.next());
		System.out.print("Enter company name:");
		stock1.setName(input.next());
		System.out.print("Enter previous closing price:");
		stock1.setPreviousClosingPrice(input.nextDouble());
		System.out.print("Enter current price:");
		stock1.setCurrentPrice(input.nextDouble());
		
		System.out.print("Previous Closing Price: " + stock1.getPreviousClosingPrice() 
		+ "\nCurrent Price: " + stock1.getCurrentPrice()
		+ "\nPrice Change: " + stock1.getChangePercent() + "%");
		

	}

}

