package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentViewer extends JFrame {

	public StudentViewer() { 

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Code");
		model.addColumn("Name");
		model.addColumn("Author");
		model.addColumn("Publisher");


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
	}

}
