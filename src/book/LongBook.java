package book;

import java.util.Scanner;

import exception.AuthorFormatException;

public abstract class LongBook extends Book {

	public LongBook(BookKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + name + " code:" + code + " author:" + author + " publisher:" + publisher);		
	}

	public void setBookAuthorwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know an Author Name? (Y/N)");
			answer = input.next().charAt(0);
			input.nextLine();
			try {
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
			catch(AuthorFormatException e) {
				System.out.println("Incorrect Author Format. put the author name that contains ¿€∞°");
			}
		}
	}
}
