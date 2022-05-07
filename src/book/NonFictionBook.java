package book;

import java.util.Scanner;

public class NonFictionBook extends Book implements BookInput {

	protected String optionAuthor;
	protected String optionPublisher;


	public NonFictionBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Book Code: ");
		int code = input.nextInt(); 
		input.nextLine();
		this.setCode(code);

		System.out.print("Book Name: ");
		String name = input.nextLine();
		this.setName(name);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know an Author Name? (Y/N)");
			answer = input.next().charAt(0);
			input.nextLine();
			if(answer ==  'y' || answer == 'Y') {
				System.out.print("Author Name: ");
				String author = input.nextLine();
				this.setAuthor(author);
				break;
			}
			else if(answer ==  'n' || answer == 'N') {
				this.setAuthor("");
				break;
			}
			else {
			}
		}

		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know an option Author Name? (Y/N)");
			answer = input.next().charAt(0);
			input.nextLine();
			if(answer ==  'y' || answer == 'Y') {
				System.out.print("option Author Name: ");
				String author = input.nextLine();
				this.setAuthor(author);
				break;
			}
			else if(answer ==  'n' || answer == 'N') {
				this.setAuthor("");
				break;
			}
			else {
			}
		}

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
		System.out.println("kind:" + skind + " name:" + name + " code:" + code + " author:" + author + " publisher:" + publisher + " option author:" + author + " option publisher:" + publisher);		
	}

}
