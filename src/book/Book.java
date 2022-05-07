package book;

import java.util.Scanner;

public abstract class Book {
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

	public abstract void printInfo();
}
