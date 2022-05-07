package book;

import java.util.Scanner;

public interface BookInput {

	public int getCode();
	
	public void setCode(int code);
	
	public void setName(String name);
	
	public void setAuthor(String author);
	
	public void setPublisher(String publisher);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
}
