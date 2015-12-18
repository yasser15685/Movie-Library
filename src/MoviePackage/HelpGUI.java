package MoviePackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class HelpGUI {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpGUI window = new HelpGUI();
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
	public HelpGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 390);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrButtonsFunctionsSearch = new JTextArea();
		txtrButtonsFunctionsSearch.setEditable(false);
		txtrButtonsFunctionsSearch.setText("Buttons' Functions:\r\n\r\nSearch: Search by movie name.\r\n\r\nAdd: Adds a movie to the library.\r\n\r\nRemove: Remove movie from library.\r\n\r\nEdit: Edit a movie's name, year, Category, Website or Location/PlayLink.\r\n\r\nYear(drop list): show all movies from selected year from drop list. \r\n\r\nCategory(drop list): shopw all movies from selected category from drop list.\r\n\r\nCopy: Copy the selected movie(s) to paste it somewhere else.\r\n\r\nMove: Cut the selected movie(s) to paste it somewher else.");
		txtrButtonsFunctionsSearch.setBounds(10, 11, 622, 330);
		frame.getContentPane().add(txtrButtonsFunctionsSearch);
	}

}
