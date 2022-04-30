package book;

import java.util.Scanner;

public class Book {
	protected BookKind kind = BookKind.Novel;
	protected String name;
	protected int code;
	protected String author;
	protected String publisher;

	public Book() {	
	}


	public Book(BookKind kind) {
		this.kind = kind;
	}

	public Book(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public Book(String name, int code, String author, String publisher) {
		this.name = name;
		this.code = code;
		this.author = author;
		this.publisher = publisher;
	}

	public Book(BookKind kind, String name, int code, String author, String publisher) {
		this.kind = kind;
		this.name = name;
		this.code = code;
		this.author = author;
		this.publisher = publisher;
	}

	public BookKind getKind() {
		return kind;
	}

	public void setKind(BookKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

}
