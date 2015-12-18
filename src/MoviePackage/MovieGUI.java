package MoviePackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MovieGUI {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieGUI window = new MovieGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MovieGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 945, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(109, 11, 89, 23);
		frame.getContentPane().add(btnRemove);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(208, 11, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		textField = new JTextField();
		textField.setBounds(307, 12, 457, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("?");
		button.setBounds(873, 11, 46, 23);
		frame.getContentPane().add(button);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(774, 11, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Year"}));
		comboBox.setBounds(10, 45, 89, 20);
		frame.getContentPane().add(comboBox);
		
		JList list = new JList();
		list.setBounds(10, 100, 122, 323);
		frame.getContentPane().add(list);
		
		JLabel lblCategories = new JLabel("Categories:");
		lblCategories.setBounds(10, 75, 89, 14);
		frame.getContentPane().add(lblCategories);
		
		JLabel lblResults = new JLabel("Results:");
		lblResults.setBounds(152, 75, 46, 14);
		frame.getContentPane().add(lblResults);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(162, 100, 757, 323);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Chef", "2014", "Play", "Action, Comjedy, Drama, Action, Comjedy, Drama, Action, Comjedy, Drama", "Www.Google.com"},
			},
			new String[] {
				"Name", "Year", "Play", "Category", "Info"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(143);
		table.getColumnModel().getColumn(0).setMinWidth(35);
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setMinWidth(35);
		table.getColumnModel().getColumn(1).setMaxWidth(40);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setMinWidth(35);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setMinWidth(50);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		scrollPane.setRowHeaderView(table);
		scrollPane.setViewportView(table);
		
		JButton btnMove = new JButton("Move");
		btnMove.setBounds(830, 434, 89, 23);
		frame.getContentPane().add(btnMove);
		
		JButton btnCopy = new JButton("Copy");
		btnCopy.setBounds(731, 434, 89, 23);
		frame.getContentPane().add(btnCopy);
	}
}
