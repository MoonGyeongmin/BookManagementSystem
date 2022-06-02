package book;

import java.util.Scanner;

import exception.AuthorFormatException;

public interface BookInput {

	public int getCode();

	public void setCode(int code);

	public String getName();

	public void setName(String name);

	public String getAuthor();

	public void setAuthor(String author) throws AuthorFormatException;

	public String getPublisher();

	public void setPublisher(String publisher);

	public void getUserInput(Scanner input);

	public void printInfo();

	public void setBookCode(Scanner input);

	public void setBookName(Scanner input);

	public void setBookAuthor(Scanner input);

	public void setBookPublisher(Scanner input);

}
