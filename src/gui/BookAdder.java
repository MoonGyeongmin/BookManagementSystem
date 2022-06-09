package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.BookAdderCancelListener;
import event.BookAdderListerner;
import manager.BookManager;

public class BookAdder extends JPanel {

	WindowFrame frame;
	BookManager bookmanager;

	public BookAdder(WindowFrame frame, BookManager bookmanager) {
		this.frame = frame;
		this.bookmanager = bookmanager;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelCode = new JLabel("Code: ", JLabel.TRAILING);
		JTextField fieldCode = new JTextField(10);
		labelCode.setLabelFor(fieldCode);
		panel.add(labelCode);
		panel.add(fieldCode);

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelAuthor = new JLabel("Author: ", JLabel.TRAILING);
		JTextField fieldAuthor = new JTextField(10);
		labelAuthor.setLabelFor(fieldAuthor);
		panel.add(labelAuthor);
		panel.add(fieldAuthor);

		JLabel labelPublisher = new JLabel("Publisher: ", JLabel.TRAILING);
		JTextField fieldPublisher = new JTextField(10);
		labelPublisher.setLabelFor(fieldPublisher);

		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new BookAdderListerner(fieldCode,fieldName,fieldAuthor,fieldPublisher,bookmanager));

		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new BookAdderCancelListener(frame));

		panel.add(labelPublisher);
		panel.add(fieldPublisher);

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);


		this.add(panel);
		this.setVisible(true);



	}

}
