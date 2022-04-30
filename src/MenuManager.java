import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		BookManager bookmanager = new BookManager(input);

		while (num != 5) {
			System.out.println("1. Add Books");
			System.out.println("2. Delete Books");
			System.out.println("3. Edit Book");
			System.out.println("4. View Books");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5:");

			num = input.nextInt();

			if (num == 1) {
				bookmanager.addBooks();
			}
			else if (num == 2) {
				bookmanager.deleteBooks();
			}
			else if (num == 3) {
				bookmanager.editBooks();
			}
			else if (num == 4) {
				bookmanager.viewBooks();
			}
			else {
				continue;
			}
		}
	}
}
