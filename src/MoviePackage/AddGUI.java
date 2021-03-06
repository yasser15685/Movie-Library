package MoviePackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddGUI {

	public JFrame frame;
	public MovieGUI movieGUI;
	private JTextField movieName;
	private JTextField movieYear;
	private JTextField moviePath;
	private JTextField movieLink;
	JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddGUI window = new AddGUI();
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
	public AddGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(225, 11, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setBounds(225, 37, 46, 14);
		frame.getContentPane().add(lblYear);
		
		JLabel lblLink = new JLabel("Link:");
		lblLink.setBounds(225, 121, 46, 14);
		frame.getContentPane().add(lblLink);
		
		JLabel lblLocationplay = new JLabel("Location (Play):");
		lblLocationplay.setBounds(225, 62, 105, 14);
		frame.getContentPane().add(lblLocationplay);
		
		JLabel lblCategories = new JLabel("Categories:");
		lblCategories.setBounds(10, 11, 66, 14);
		frame.getContentPane().add(lblCategories);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(movieName.getText().equals("")||movieYear.getText().equals("")||moviePath.getText().equals("")||list.isSelectionEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Check missing information", "Missing Information Error", JOptionPane.ERROR_MESSAGE );
				}
				else{
				//	String Category = "";
					//list.
					//Movie movie = new Movie(movieName.getText(),movieYear.getText(), movieCategory.)
				}
			}
		});
		btnSave.setBounds(335, 194, 89, 23);
		frame.getContentPane().add(btnSave);
		
		movieName = new JTextField();
		movieName.setBounds(312, 8, 112, 20);
		frame.getContentPane().add(movieName);
		movieName.setColumns(10);
		
		movieYear = new JTextField();
		movieYear.setColumns(10);
		movieYear.setBounds(312, 34, 112, 20);
		frame.getContentPane().add(movieYear);
		
		moviePath = new JTextField();
		moviePath.setEditable(false);
		moviePath.setColumns(10);
		moviePath.setBounds(225, 90, 199, 20);
		frame.getContentPane().add(moviePath);
		
		movieLink = new JTextField();
		movieLink.setColumns(10);
		movieLink.setBounds(312, 121, 112, 20);
		frame.getContentPane().add(movieLink);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser choose=new JFileChooser();
				
				choose.setCurrentDirectory(new java.io.File("C:\\"));
				choose.setDialogTitle("Browse Movie");
				choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
				choose.setAcceptAllFileFilterUsed(false);
				choose.changeToParentDirectory();
				if(choose.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
				{
					System.out.println(choose.getSelectedFile().getPath());
					moviePath.setText(choose.getSelectedFile().getPath());
				}
								
			}
		});
		btnBrowse.setBounds(340, 58, 84, 23);
		frame.getContentPane().add(btnBrowse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 37, 199, 214);
		frame.getContentPane().add(scrollPane);
		
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Action", "Adventure", "Animation", "Comedy", "Crime", "Drama", "Historical", "Horror", "Musical", "Mystery", "Sci-Fi", "Thriller", "War", "Westerns"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
	}

}
