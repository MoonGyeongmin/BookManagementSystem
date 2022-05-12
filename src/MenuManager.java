import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		BookManager bookmanager = new BookManager(input);
		selectMenu(input, bookmanager);
	}

	public static void selectMenu(Scanner input, BookManager bookmanager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					bookmanager.addBooks();
					break;
				case 2:
					bookmanager.deleteBooks();
					break;
				case 3:
					bookmanager.editBooks();
					break;
				case 4:
					bookmanager.viewBooks();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer btween 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Student Management System menu ***");
		System.out.println("1. Add Books");
		System.out.println("2. Delete Books");
		System.out.println("3. Edit Book");
		System.out.println("4. View Books");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
}
