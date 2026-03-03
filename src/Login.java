import java.awt.EventQueue;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import javax.print.PrintException;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.table.TableRowSorter;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.awt.event.ItemListener;
import java.net.URI;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Login {

	private JFrame frame;
	boolean checkk=false;
	private JTextField textField_4;
	static String Path="C:/Prominer/";
	private JPasswordField passwordField;
	
	static void setHiddenProperty(File file) throws InterruptedException, IOException {
	    Process p = Runtime.getRuntime().exec("attrib +H " + file.getPath());
	    p.waitFor();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				//First time
				File ff=new File(Path+"Check.txt");
				if(ff.exists()==false)
				{
					try {
						ff.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					WriteFile W=new WriteFile(Path+"Check.txt");
					try {
						W.writeToFile("1");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					File ACN=new File(Path+"Account_Holders_Name.txt");
					if(ACN.exists()==false)
					{
						try {
							ACN.createNewFile();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					WriteFile W1=new WriteFile(Path+"Account_Holders_Name.txt");
					try {
						System.out.println("1");
						W1.writeToFile("Please Select Account Holder's Name");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			
				
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				double width = screenSize.getWidth();
				double height = screenSize.getHeight();
				System.out.println(width+" x "+height);
				String Dim=width+" x "+height+"";
				try{
				if(Dim.equals("1920.0 x 1080.0")==true)
				{
					Login window = new Login();
					window.frame.setVisible(true);
				}
				else
				{
					
				}
				}catch(Exception sd){}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login()throws IOException  {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {

		
		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1080);
		frame.setUndecorated(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblPleaseSelectYour = new JLabel("Please Enter Correct Details");
		lblPleaseSelectYour.setVisible(false);
		lblPleaseSelectYour.setForeground(Color.RED);
		lblPleaseSelectYour.setFont(new Font("Caviar Dreams", Font.BOLD, 22));
		lblPleaseSelectYour.setBounds(218, 722, 305, 25);
		frame.getContentPane().add(lblPleaseSelectYour);
		
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Login.png")).getImage();
		frame.getContentPane().setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		
		
		JButton btnX = new JButton("X");
		btnX.setForeground(Color.WHITE);
		btnX.setFont(new Font("Caviar Dreams", Font.BOLD, 13));
		btnX.setHorizontalAlignment(SwingConstants.RIGHT);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnX.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnX.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		btnX.setVisible(true);
		frame.getContentPane().setLayout(null);
		btnX.setOpaque(false);// Invisible
		btnX.setContentAreaFilled(false);// Invisible
		btnX.setBorderPainted(false);// Invisible
		btnX.setBounds(1749, 0, 171, 41);
		frame.getContentPane().add(btnX);
		
		
		
		

		JButton button_1 = new JButton("");
		button_1.setOpaque(false);
		button_1.setBackground(null);
		button_1.setContentAreaFilled(false);// Invisible
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ID=textField_4.getText();;
				String Password=passwordField.getText();
				if(ID.equalsIgnoreCase("Parth Shah") && Password.equals("Password"))
				{
					checkk=true;
				}
				if(checkk==false)
				{
					lblPleaseSelectYour.setVisible(true);
				}
				else
				{
					try{
					Chequeman C=new Chequeman();
					C.main(null);
					}catch(Exception ed){}
				
				}
				
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_1.setBounds(310, 760, 101, 110);
		frame.getContentPane().add(button_1);
		
		
		
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Rockwell", Font.PLAIN, 30));
		textField_4.setColumns(10);
		textField_4.setBounds(342, 537, 227, 37);
		frame.getContentPane().add(textField_4);
		
		
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID=textField_4.getText();;
				String Password=passwordField.getText();
				if(ID.equalsIgnoreCase("Parth Shah") && Password.equals("Password"))
				{
					checkk=true;
				}
				if(checkk==false)
				{
					lblPleaseSelectYour.setVisible(true);
				}
				else
				{
					try{
					Chequeman C=new Chequeman();
					C.main(null);
					}catch(Exception ed){}
				
				}
				
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(342, 649, 227, 41);
		frame.getContentPane().add(passwordField);
		
		
		
		
		JLabel lblReport = new JLabel("");
		lblReport.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
					lblReport.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					lblReport.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d=Desktop.getDesktop();
				try {
					d.browse(new URI("http://www.prominergroup.com"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		
		ReadFile R=new ReadFile(Login.Path+"Bank_List.txt");
	    String Bank[]=R.OpenFile();
		lblReport.setForeground(Color.WHITE);
		lblReport.setFont(new Font("Copse", Font.PLAIN, 22));
		lblReport.setBounds(12, 983, 205, 47);
		frame.getContentPane().add(lblReport);
		
		
		
		JLabel lblPrint = new JLabel("Enter");
		lblPrint.setForeground(Color.WHITE);
		lblPrint.setFont(new Font("Copse", Font.BOLD, 17));
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setBounds(320, 884, 103, 25);
		frame.getContentPane().add(lblPrint);
		
		
		
		
		
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(lblNewLabel);

	}

}
