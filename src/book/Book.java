package book;

import java.util.Scanner;

import exception.AuthorFormatException;

public abstract class Book implements BookInput{
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

	public void setAuthor(String author) throws AuthorFormatException {
		if (!author.contains("작가") && !author.equals("")) {
			throw new AuthorFormatException();
		}

		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public abstract void printInfo();

	public void setBookCode(Scanner input) {
		System.out.print("Book Code: ");
		int code = input.nextInt();
		this.setCode(code);
	}

	public void setBookName(Scanner input) {
		System.out.print("Book name: ");
		String name = input.next();
		this.setName(name);
		input.nextLine();
	}

	public void setBookAuthor(Scanner input) {
		String author = "";
		while (!author.contains("작가")) {
			System.out.print("Book author: ");
			author = input.next();
			try {
				this.setAuthor(author);
			} catch (AuthorFormatException e) {
				System.out.println("Incorrect Author Format. put the author name that contains 작가");
			}
		}
	}

	public void setBookPublisher(Scanner input) {
		System.out.print("Book publisher: ");
		String publisher = input.next();
		this.setPublisher(publisher);
		input.nextLine();
	}

	public String getKindString() {
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
		return skind;
	}
}
