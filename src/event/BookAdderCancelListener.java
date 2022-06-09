package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookViewer;
import gui.WindowFrame;

public class BookAdderCancelListener implements ActionListener {

	WindowFrame frame;

	public BookAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
