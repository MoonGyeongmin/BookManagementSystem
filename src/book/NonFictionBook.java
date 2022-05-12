package book;

import java.util.Scanner;

import exception.AuthorFormatException;

public class NonFictionBook extends LongBook {

	protected String optionAuthor;
	protected String optionPublisher;


	public NonFictionBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {	//
		setBookCode(input);
		setBookName(input);
		setBookAuthorwithYN(input);
		setOptionBookAuthorwithYN(input);
		setBookPublisher(input);
	}

	public void setOptionBookAuthorwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Do you know an option Author Name? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer ==  'y' || answer == 'Y') {
					setBookAuthor(input);
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

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + name + " code:" + code + " author:" + author + " publisher:" + publisher + " option author:" + author + " option publisher:" + publisher);		
	}
}
