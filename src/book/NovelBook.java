package book;

import java.util.Scanner;

public class NovelBook extends Book {

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

		System.out.print("Publisher Name: ");
		String publisher = input.nextLine();
		this.setPublisher(publisher);
	}

}
