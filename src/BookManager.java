import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import book.Book;
import book.BookInput;
import book.BookKind;
import book.NonFictionBook;
import book.NovelBook;
import book.PoemBook;

public class BookManager {
	ArrayList<BookInput> books = new ArrayList<BookInput>();
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	public void addBooks() {
		int kind = 0;
		BookInput bookInput;
		while(kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Poem ");
				System.out.println("2 for Novel ");
				System.out.println("3 for NonFiction ");
				System.out.print("Select num 1, 2, or 3 for Book Kind:");
				kind = input.nextInt(); 
				if(kind == 1) {
					bookInput = new PoemBook(BookKind.Poem);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if(kind == 2) {
					bookInput = new NovelBook(BookKind.Novel);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if(kind == 3) {
					bookInput = new NonFictionBook(BookKind.NonFiction);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else {
					System.out.print("Select num for Book Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer btween 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteBooks() {
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();
		int index = findIndex(bookCode);
		removefromBooks(index,bookCode);
	}

	public int findIndex(int bookCode) {
		int index = -1; //배열에서 아무것도 못찾음 설정
		for(int i = 0;i<books.size(); i++) {
			if (books.get(i).getCode() == bookCode) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromBooks(int index,int bookCode) {
		if(index>=0) {		//찾음을 의미
			books.remove(index);
			System.out.println("the book " + bookCode + " is deleted");
			return 1;
		}

		else {
			System.out.println("the book has not been registered");
			return -1;
		}
	}

	public void editBooks() {
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();
		for(int i=0;i<books.size();i++) {
			BookInput book = books.get(i); 
			if (book.getCode() == bookCode) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						book.setBookCode(input);
						break;
					case 2:
						book.setBookName(input);
						break;
					case 3:
						book.setBookAuthor(input);
						break;
					case 4:
						book.setBookPublisher(input);
						break;
					default:
						continue;
					}
				} //while
				break;
			}//if
		}//for
	}

	public void viewBooks() {
		System.out.println("# of registered books: " + books.size());
		for(int i = 0;i<books.size(); i++) {
			books.get(i).printInfo();
		}
	}



	public void showEditMenu() {
		System.out.println("** Book Info Edit Menu **");
		System.out.println("1. Edit BookCode");
		System.out.println("2. Edit BookName");
		System.out.println("3. Edit BookAuthor");
		System.out.println("4. Edit BookPublisher");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
}

