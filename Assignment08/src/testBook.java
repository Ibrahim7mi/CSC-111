import java.util.Scanner;

public class testBook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book b1 = new Book();

		System.out.println("Please, enter the book details #ISBN, author, title, and genre.");
		b1.ISBN = input.nextInt();
		b1.author = input.next();
		b1.title = input.next();
		b1.genre = input.next();

		if (b1.verifyISBN(b1.ISBN)) {
			System.out.println(b1.toString());
		} else
			System.out.println("Invalid ISBN");

	}

}
