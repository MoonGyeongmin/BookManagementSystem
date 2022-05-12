package book;

import java.util.Scanner;

public class PoemBook extends Book {

	public PoemBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setBookCode(input);
		setBookName(input);
		setBookAuthor(input);
		setBookPublisher(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + name + " code:" + code + " author:" + author + " publisher:" + publisher);		
	}
}
