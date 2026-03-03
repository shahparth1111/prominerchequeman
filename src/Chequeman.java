import java.awt.EventQueue;
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

public class Chequeman {

	private JFrame frame;
	static String filen="";
	private JTextField textField;
	private JTextField textField_1; 
	private JTextField textField_2;
	private JTextField textField_3;
	static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	static Calendar cal = Calendar.getInstance();
	static String time="";
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						Chequeman window = new Chequeman();
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
	public Chequeman()throws IOException  {
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

		
		JLabel lblPleaseSelectYour = new JLabel("Please Select Your Bank");
		lblPleaseSelectYour.setVisible(false);
		lblPleaseSelectYour.setForeground(Color.RED);
		lblPleaseSelectYour.setFont(new Font("Caviar Dreams", Font.BOLD, 22));
		lblPleaseSelectYour.setBounds(619, 791, 305, 25);
		frame.getContentPane().add(lblPleaseSelectYour);
		
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Homescreen.png")).getImage();
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
		
		
		
		
		
		textField = new JTextField(dateFormat.format(cal.getTime())+"");
		textField.setFont(new Font("Rockwell", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(745, 426, 226, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Rockwell", Font.PLAIN, 30));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(745, 491, 226, 39);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Rockwell", Font.PLAIN, 30));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(745, 551, 226, 39);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField("A/C Payee");
		textField_3.setFont(new Font("Rockwell", Font.PLAIN, 30));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(745, 615, 226, 39);
		frame.getContentPane().add(textField_3);

		
		
		JButton button_1 = new JButton("");
		button_1.setOpaque(false);
		button_1.setBackground(null);
		//button_1.setBorderPainted(false);
		button_1.setContentAreaFilled(false);// Invisible
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(filen.equals("")==true)
				{
					lblPleaseSelectYour.setVisible(true);
				}
				else
				{
					try{
					C1 c=new C1();
					try {
						String D="";
						String d=textField.getText();
						for(int i=0;i<d.length();i++)
						{
							char c2=d.charAt(i);
							if(c2=='-')
							{
								
							}
							else
							{
								D+=c2+" ";
							}
						}
						System.out.println(D.trim()+" "+textField_1.getText()+""+" "+textField_2.getText()+""+" "+""+filen);
						
						c.PDFMaker(D.trim(),textField_1.getText()+"",textField_2.getText()+"",""+11);
						File ff=new File(Login.Path+"data.txt");
						if(ff.exists()==false)
						{
							ff.createNewFile();
						}
						WriteFile W=new WriteFile(Login.Path+"data.txt",true);
						W.writeToFile(textField.getText()+";"+textField_1.getText()+";"+textField_2.getText()+";"+textField_3.getText()+";"+textField_4.getText()+";"+textField_5.getText()+";");
						frame.dispose();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}catch(Exception hhg){}
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
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Rockwell", Font.PLAIN, 30));
		textField_4.setColumns(10);
		textField_4.setBounds(745, 678, 227, 37);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Rockwell", Font.PLAIN, 30));
		textField_5.setColumns(10);
		textField_5.setBounds(745, 741, 227, 37);
		frame.getContentPane().add(textField_5);
		button_1.setBounds(714, 829, 101, 93);
		frame.getContentPane().add(button_1);
		
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
		lblReport.setForeground(Color.WHITE);
		lblReport.setFont(new Font("Copse", Font.PLAIN, 22));
		lblReport.setBounds(12, 983, 205, 47);
		frame.getContentPane().add(lblReport);
		
		
		
		ReadFile R=new ReadFile(Login.Path+"Bank_List.txt");
	    String Bank[]=R.OpenFile();
		JComboBox comboBox = new JComboBox(Bank);
		comboBox.addItemListener(
				new ItemListener(){
					@Override
					public void itemStateChanged(ItemEvent arg0) {
						// TODO Auto-generated method stub
						//try{
							String G2=(String)comboBox.getSelectedItem();
							int count=0;
							for(int i=0;i<Bank.length;i++)
							{
								count++;
								if(Bank[i].equals(G2) && G2.equals(null)==false)
								{
									filen=count+"";
									System.out.println(filen);
									//System.out.println("Count = "+Login_1.Login.filen);
									ReadFile filee=new ReadFile(Login.Path+""+filen+".txt");
											String s[];
											try {
												s = filee.OpenFile();
											
									
									s[0]=s[0].trim();
									s[1]=s[1].trim();
									s[2]=s[2].trim();
									s[3]=s[3].trim();
									
									int a=0,b=0;
									Scanner in=new Scanner(s[0]);
									int counte=0;
									while(in.hasNext()==true)
									{
										counte++;
										String G=in.next();
										if(counte==1)
											a=Integer.parseInt(G);
										if(counte==2)
											b=Integer.parseInt(G);
									}
									int c1=0,d=0;
									Scanner in1=new Scanner(s[1]);
									int count1=0;
									while(in1.hasNext()==true)
									{
										count1++;
										String G=in1.next();
										if(count1==1)
											c1=Integer.parseInt(G);
										if(count1==2)
											d=Integer.parseInt(G);
									}
									int e=0,f1=0;
									Scanner in2=new Scanner(s[2]);
									int count2=0;
									while(in2.hasNext()==true)
									{
										count2++;
										String G=in2.next();
										if(count2==1)
											e=Integer.parseInt(G);
										if(count2==2)
											f1=Integer.parseInt(G);
									}
									int g=0,h=0;
									Scanner in3=new Scanner(s[3]);
									int count3=0;
									while(in3.hasNext()==true)
									{
										count3++;
										String G=in3.next();
										if(count3==1)
											g=Integer.parseInt(G);
										if(count3==2)
											h=Integer.parseInt(G);
									}
									break;
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
								}
							}
						//}catch(Exception sdfnh){}
					}	
				});
		comboBox.setFont(new Font("Copse", Font.PLAIN, 25));
		comboBox.setBounds(573, 358, 398, 39);
		frame.getContentPane().add(comboBox);
		
		
		
		
		
		JButton button_2 = new JButton("");
		Image img1=new ImageIcon(this.getClass().getResource("/Settings.png")).getImage();
		button_2.setIcon(new ImageIcon(img1));
		button_2.setOpaque(false);
		button_2.setBackground(null);
		button_2.setBorderPainted(false);
		button_2.setContentAreaFilled(false);// Invisible
		button_2.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				button_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d=Desktop.getDesktop();
				try {
					Settings1 s=new Settings1();
					s.setVisible(true);
				} catch (Exception sdf){
					// TODO Auto-generated catch block
				
				}
			}
		});
		button_2.setBounds(983, 347, 57, 56);
		frame.getContentPane().add(button_2);
		
		
		
		
		JButton button = new JButton("");
		button.setOpaque(false);
		button.setBackground(null);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);// Invisible
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DelimitedToXls.main(null);
					System.exit(0);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				button.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
		});
		button.setBounds(1797, 838, 93, 122);
		frame.getContentPane().add(button);
		
		
		
		
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Accounts A=new Accounts();
				A.main(null);
				}catch(Exception sds){}
			}
		});
		button_3.setOpaque(false);
		button_3.setFont(new Font("Rockwell", Font.PLAIN, 20));
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBackground((Color) null);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				Image img7=new ImageIcon(this.getClass().getResource("/B_Accounts.png")).getImage();
				button_3.setIcon(new ImageIcon(img7));
				button_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					button_3.setIcon(null);
				}
		});
		button_3.setBounds(842, 200, 231, 56);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Balance B1=new Balance();
					B1.main(null);
					}catch(Exception sds){}
			}
		});
		button_4.setOpaque(false);
		button_4.setFont(new Font("Rockwell", Font.PLAIN, 20));
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setBackground((Color) null);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				Image img7=new ImageIcon(this.getClass().getResource("/B_Balance.png")).getImage();
				button_4.setIcon(new ImageIcon(img7));
				button_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button_4.setIcon(null);
					button_4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
		});
		button_4.setBounds(1110, 199, 231, 56);
		frame.getContentPane().add(button_4);
		
		
		JButton btnCheueman = new JButton("");
		btnCheueman.disable();
		btnCheueman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
			}
		});
		btnCheueman.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				btnCheueman.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnCheueman.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
		});
		btnCheueman.setFont(new Font("Rockwell", Font.PLAIN, 20));
		btnCheueman.setContentAreaFilled(false);
		btnCheueman.setOpaque(false);// Invisible
		btnCheueman.setBorderPainted(false);// Invisible
		btnCheueman.setBounds(459, 108, 227, 59);
		//Image img6=new ImageIcon(this.getClass().getResource("/Cheq.png")).getImage();
		//btnCheueman.setIcon(new ImageIcon(img6));
		frame.getContentPane().add(btnCheueman);
		
		JButton btnMoneyCards = new JButton("");
		btnMoneyCards.setOpaque(false);
		btnMoneyCards.setBackground(null);
		btnMoneyCards.setBorderPainted(false);
		btnMoneyCards.setContentAreaFilled(false);// Invisible
		btnMoneyCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMoneyCards.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				Image img7=new ImageIcon(this.getClass().getResource("/B_Money_Card.png")).getImage();
				btnMoneyCards.setIcon(new ImageIcon(img7));
				btnMoneyCards.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
	
					btnMoneyCards.setIcon(null);
					btnMoneyCards.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
		});
		btnMoneyCards.setFont(new Font("Rockwell", Font.PLAIN, 20));
		btnMoneyCards.setBounds(979, 108, 231, 59);
		frame.getContentPane().add(btnMoneyCards);
		
		JButton btnBankTransfer = new JButton("");
		btnBankTransfer.setOpaque(false);
		btnBankTransfer.setBackground(null);
		btnBankTransfer.setBorderPainted(false);
		btnBankTransfer.setContentAreaFilled(false);// Invisible
		btnBankTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Bank_Transfer B=new Bank_Transfer();
				B.main(null);
				}
				catch(Exception sdssss){}
			}
		});
		btnBankTransfer.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				Image img7=new ImageIcon(this.getClass().getResource("/B_Bank_Transfer.png")).getImage();
				btnBankTransfer.setIcon(new ImageIcon(img7));
				btnBankTransfer.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnBankTransfer.setIcon(null);
					btnBankTransfer.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
		});
		btnBankTransfer.setFont(new Font("Rockwell", Font.PLAIN, 20));
		btnBankTransfer.setBounds(718, 108, 231, 59);
		frame.getContentPane().add(btnBankTransfer);
		

		JButton btnMoneyOrder = new JButton("");
		btnMoneyOrder.setOpaque(false);
		btnMoneyOrder.setBackground(null);
		btnMoneyOrder.setBorderPainted(false);
		btnMoneyOrder.setContentAreaFilled(false);// Invisible
		btnMoneyOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMoneyOrder.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				Image img7=new ImageIcon(this.getClass().getResource("/B_Cash.png")).getImage();
				btnMoneyOrder.setIcon(new ImageIcon(img7));
				btnMoneyOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnMoneyOrder.setIcon(null);
					btnMoneyOrder.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
		});
		btnMoneyOrder.setFont(new Font("Rockwell", Font.PLAIN, 20));
		btnMoneyOrder.setBounds(1506, 108, 227, 59);
		frame.getContentPane().add(btnMoneyOrder);
		
		JButton btnOnlinePay = new JButton("");
		btnOnlinePay.setOpaque(false);
		btnOnlinePay.setBackground(null);
		btnOnlinePay.setBorderPainted(false);
		btnOnlinePay.setContentAreaFilled(false);// Invisible
		btnOnlinePay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOnlinePay.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseEntered(MouseEvent arg0) {
				Image img7=new ImageIcon(this.getClass().getResource("/B_Online_Pay.png")).getImage();
				btnOnlinePay.setIcon(new ImageIcon(img7));
				btnOnlinePay.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnOnlinePay.setIcon(null);
					btnOnlinePay.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
		});
		btnOnlinePay.setFont(new Font("Rockwell", Font.PLAIN, 20));
		btnOnlinePay.setBounds(1246, 108, 231, 59);
		frame.getContentPane().add(btnOnlinePay);
		
		
		
		JLabel lblPrint = new JLabel("Print");
		lblPrint.setForeground(Color.WHITE);
		lblPrint.setFont(new Font("Copse", Font.BOLD, 17));
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setBounds(712, 935, 103, 25);
		frame.getContentPane().add(lblPrint);
		
		
		
		
		
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(lblNewLabel);

	}
}
