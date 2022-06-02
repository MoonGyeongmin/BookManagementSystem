package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.BookManager;

public class WindowFrame extends JFrame {

	BookManager bookmanager;

	MenuSelection menuselection;
	BookAdder studentadder;
	BookViewer studentviewer;

	public WindowFrame(BookManager bookmanager) {

		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.bookmanager = bookmanager;
		this.menuselection = new MenuSelection(this);
		this.studentadder = new BookAdder(this);
		this.studentviewer = new BookViewer(this,this.bookmanager);	


		this.add(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();

	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public BookAdder getStudentadder() {
		return studentadder;
	}

	public void setStudentadder(BookAdder studentadder) {
		this.studentadder = studentadder;
	}

	public BookViewer getStudentviewer() {
		return studentviewer;
	}

	public void setStudentviewer(BookViewer studentviewer) {
		this.studentviewer = studentviewer;
	}


}
