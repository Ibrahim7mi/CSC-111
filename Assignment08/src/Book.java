
public class Book {
	public int ISBN;
	public String author, title, genre;

	public String generateRefrence() {
		return "" + author.charAt(0) + author.charAt(1) + "-" + genre.charAt(0) + genre.charAt(1);
	}

	public boolean verifyISBN(int ISBN) {
		int n1, n2, n3, n4, z;
		n4 = ISBN % 10;
		n3 = (ISBN / 10) % 10;
		n2 = (ISBN / 100) % 10;
		n1 = (ISBN / 1000) % 10;

		if ((n1 * 3 + n2 * 2 + n1 * 1) % 4 == n4)
			return true;
		else
			return false;
	}

	public String toString() {
		return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + "  - Refrence Code: "
				+ generateRefrence() + "\nGenre: " + genre;
	}

}
