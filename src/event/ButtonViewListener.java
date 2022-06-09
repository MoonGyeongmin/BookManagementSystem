package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.BookViewer;
import gui.WindowFrame;
import manager.BookManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		BookViewer bookViewer = frame.getBookviewer();
		BookManager bookmanager = getObject("bookmanager.ser");
		bookViewer.setBookmanager(bookmanager);

		frame.getContentPane().removeAll();
		frame.getContentPane().add(bookViewer);
		frame.revalidate();
		frame.repaint();
	}

	public static BookManager getObject(String filename) {
		BookManager bookmanager = null;
		try {
			FileInputStream	file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			bookmanager = (BookManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return bookmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookmanager;	
	}
}
