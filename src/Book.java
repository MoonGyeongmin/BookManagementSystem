
public class Book {
	
	String name;
	int code;
	String author;
	String publisher;
	
	public Book() {	
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
	
	public void printInfo() {
		System.out.println("name:" + name + " code:" + code + " author:" + author + " publisher:" + publisher);		
	}
	
}
