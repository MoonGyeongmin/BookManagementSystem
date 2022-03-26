import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num != 6) {
			System.out.println("1. Add Books");
			System.out.println("2. Delete Books");
			System.out.println("3. Edit Books");
			System.out.println("4. View Books");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");

			num = input.nextInt();

			if (num == 1) {
				addBooks();

			}
			else if (num == 2) {
				deleteBooks();
			}
			else if (num == 3) {
				editBooks();
			}
			else if (num == 4) {
				viewBooks();
			}
		}
	}

	public static void addBooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Code: ");
		int bookCode = input.nextInt(); 
		input.nextLine();

		System.out.print("Book Name: ");
		String bookName = input.nextLine();

		System.out.print("Author Name: ");
		String authorName = input.nextLine();

		System.out.print("Publisher Name: ");
		String publisherName = input.nextLine();	
	}
	public static void deleteBooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();
	}
	public static void editBooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();
	}
	public static void viewBooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Code: ");
		int bookCode = input.nextInt();	
	}


}
