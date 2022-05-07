package book;

import java.util.Scanner;

public class PoemBook extends Book implements BookInput{

	public PoemBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Book Code: ");
		int code = input.nextInt(); 
		this.setCode(code);
		input.nextLine();

		System.out.print("Book Name: ");
		String name = input.nextLine();
		this.setName(name);

		System.out.print("Author Name: ");
		String author = input.nextLine();
		this.setAuthor(author);

		System.out.print("Publisher Name: ");
		String publisher = input.nextLine();
		this.setPublisher(publisher);
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Poem:
			skind = "Poem";
			break;
		case Novel:
			skind = "Novel";
			break;
		case ComicBook:
			skind = "ComicBook";
			break;
		case NonFiction:
			skind = "NonFiction";
			break;
		default:
		}
		System.out.println("kind:" + skind + " name:" + name + " code:" + code + " author:" + author + " publisher:" + publisher);		
	}
}
