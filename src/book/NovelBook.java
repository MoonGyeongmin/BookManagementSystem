package book;

import java.util.Scanner;

public class NovelBook extends LongBook {

	public NovelBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setBookCode(input);
		setBookName(input);
		setBookAuthorwithYN(input);
		setBookPublisher(input);
	}
}
