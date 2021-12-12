import java.util.Scanner;
public class TestBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bank b1 = new Bank(5);
		Bank b2 = new Bank(2);
		
		b2.addClient("Mike",1000);
		b2.addClient("Joe", 3000);
		
		System.out.println("********************************");
		System.out.println("* 1 - Add Client.               *");
		System.out.println("* 2 - Close a client account.   *");
		System.out.println("* 3 - Deposit.                  *");
		System.out.println("* 4 - Deposit.                  *");
		System.out.println("* 5 - Transfer.                 *");
		System.out.println("* 6 - Transfer to another bank. *");
		System.out.println("* 7 - Display balance.          *");
		System.out.println("* 8 - Find the richest client.  *");
		System.out.println("* 9 - Exit.                     *");
		System.out.println("********************************");
		System.out.print("=> ");
		
		switch(input.nextInt()) {
		case 1 :
			System.out.println("Enter the name and balance of new client.");
			b1.addClient(input.next(), input.nextDouble());
			System.out.println("DONE");
			break;
			
		case 2 :
			System.out.println("Enter the name of the client you want to close his/her account. ");
			b1.deleteClient(input.next());
			System.out.println("DONE");
			break;
			
		case 3 : 
			System.out.println("Enter from name, to name, and amount: ");
			b1.transfer(input.next(), input.next(), input.nextDouble());
			System.out.println("DONE");
			break;
			
		case 4 : 
			System.out.println("Enter name and amount: ");
			if(b1.deposit(input.next(),input.nextDouble()))
				System.out.println("DONE");
			else 
				System.out.println("ERROR");
		
		case 5 :
			System.out.println("Enter from name,to bank, to name, and amount: ");
			if(b1.transferToBank(input.next(),input.next(),input.next(),input.nextDouble()))
				System.out.println("DONE");
			else 
				System.out.println("ERROR");
		}
		
		

	}

}
