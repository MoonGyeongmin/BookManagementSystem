import java.util.Scanner;

public class BookManager {
	Book book;
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	public void addBooks() {
		book = new Book();
		System.out.print("Book Code: ");
		book.code = input.nextInt(); 
		input.nextLine();
		System.out.print("Book Name: ");
		book.name = input.nextLine();
		System.out.print("Author Name: ");
		book.author = input.nextLine();
		System.out.print("Publisher Name: ");
		book.publisher = input.nextLine();	
	}
	
	public void deleteBooks() {
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();
		if (book == null) {
			System.out.println("the book has not been registered");
			return;
		}
		if (book.code == bookCode) {
			book = null;
			System.out.println("the book is deleted");
		}
	}
	
	public void editBooks() {
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();
		if (book.code == bookCode) {
			System.out.println("the book to be edited is " + bookCode);
		}
	}
	
	public void viewBooks() {
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();
		if (book.code == bookCode) {
			book.printInfo();
		}
	}

	
}
