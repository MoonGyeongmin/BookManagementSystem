package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import book.BookInput;
import book.BookKind;
import book.PoemBook;
import exception.AuthorFormatException;
import manager.BookManager;

public class BookAdderListerner implements ActionListener {


	JTextField fieldCode;
	JTextField fieldName;
	JTextField fieldAuthor;
	JTextField fieldPublisher;

	BookManager bookmanager;


	public BookAdderListerner(
			JTextField fieldCode, 
			JTextField fieldName, 
			JTextField fieldAuthor,
			JTextField fieldPublisher, BookManager bookmanager) {
		this.fieldCode = fieldCode;
		this.fieldName = fieldName;
		this.fieldAuthor = fieldAuthor;
		this.fieldPublisher = fieldPublisher;
		this.bookmanager = bookmanager;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		BookInput book = new PoemBook(BookKind.Poem);
		try {
			book.setCode(Integer.parseInt(fieldCode.getText()));
			book.setName(fieldName.getName());
			book.setAuthor(fieldAuthor.getText());
			book.setPublisher(fieldPublisher.getText());
			bookmanager.addBooks(book);
			putObject(bookmanager, "bookmanager.ser");
			book.printInfo();
		} catch (AuthorFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void putObject(BookManager bookmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(bookmanager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
