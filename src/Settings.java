import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class Settings extends JFrame {

	private JPanel contentPane;
	JLabel lblPleaseSelectYour;
	String Select="";
	String filen="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings frame = new Settings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Settings() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1366,768);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblPleaseSelectYour = new JLabel("Please Select Your Bank");
		lblPleaseSelectYour.setVisible(false);
		lblPleaseSelectYour.setForeground(Color.RED);
		lblPleaseSelectYour.setFont(new Font("Caviar Dreams", Font.BOLD, 22));
		lblPleaseSelectYour.setBounds(431, 237, 305, 25);
		getContentPane().add(lblPleaseSelectYour);
		
		JButton button = new JButton("");
		button.setBounds(1195, 0, 171, 41);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button.setVisible(true);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		button.setOpaque(false);// Invisible
		button.setContentAreaFilled(false);// Invisible
		button.setBorderPainted(false);
		getContentPane().add(button);
		
		JLabel label = new JLabel("");
		label.setBounds(470, 304, 55, 31);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(528, 304, 55, 31);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(528, 383, 55, 31);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(470, 383, 55, 31);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(528, 472, 55, 31);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(470, 472, 55, 31);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(528, 561, 55, 31);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(470, 561, 55, 31);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_7);
		
		JButton buttonn = new JButton("<");
		buttonn.setBounds(595, 389, 41, 25);
		buttonn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_2.getText());
				label_2.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(buttonn);
		
		JButton button_11 = new JButton(">");
		button_11.setBounds(683, 389, 41, 25);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_2.getText());
				label_2.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_11);
		
		JButton button_2 = new JButton("^");
		button_2.setBounds(640, 364, 41, 25);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_3.getText());
				label_3.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(640, 415, 41, 25);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_3.getText());
				label_3.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("<");
		button_4.setBounds(595, 478, 41, 25);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_4.getText());
				label_4.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("^");
		button_5.setBounds(640, 453, 41, 25);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_5.getText());
				label_5.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton(">");
		button_6.setBounds(683, 478, 41, 25);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_4.getText());
				label_4.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(640, 504, 41, 25);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_5.getText());
				label_5.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("^");
		button_8.setBounds(640, 542, 41, 25);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_7.getText());
				label_7.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("<");
		button_9.setBounds(595, 567, 41, 25);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_6.getText());
				label_6.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(640, 593, 41, 25);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_7.getText());
				label_7.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(button_10);
		
		JButton button_111 = new JButton(">");
		button_111.setBounds(683, 567, 41, 25);
		button_111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_6.getText());
				label_6.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_111);
		
		JButton button_12 = new JButton("^");
		button_12.setBounds(640, 275, 41, 25);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label.getText());
				label.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_12);
		
		JButton button_13 = new JButton("<");
		button_13.setBounds(595, 300, 41, 25);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_1.getText());
				label_1.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(640, 326, 41, 25);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label.getText());
				label.setText((num-1)+"");
				}
			}
		});
		getContentPane().add(button_14);
		
		JButton button_15 = new JButton(">");
		button_15.setBounds(683, 300, 41, 25);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(check_selection()==true)
				{
				int num=Integer.parseInt(label_1.getText());
				label_1.setText((num+1)+"");
				}
			}
		});
		getContentPane().add(button_15);
		
		
		
		JLabel lblSaved = new JLabel("Saved");
		lblSaved.setBounds(503, 584, 56, 25);
		lblSaved.setVisible(false);
		lblSaved.setForeground(Color.GREEN);
		lblSaved.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblSaved);
		
		
		ReadFile R=new ReadFile(Login.Path+"Bank_List.txt");
	    String Bank[]=R.OpenFile();
		JComboBox comboBox = new JComboBox(Bank);
		
		comboBox.addItemListener(
				new ItemListener(){
					@Override
					public void itemStateChanged(ItemEvent arg0) {
						// TODO Auto-generated method stub
						try{
							

							String G2=(String) comboBox.getSelectedItem();
							Select=G2;
							int count=0;
							for(int i=0;i<Bank.length;i++)
							{
								count++;
								if(Bank[i].equals(G2))
								{
									filen=count+"";
									System.out.println("Count = "+filen);
									ReadFile filee=new ReadFile(Login.Path+""+filen+".txt");
									String s[]=filee.OpenFile();
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
									System.out.println(a+"      "+b);
									System.out.println(c1+"      "+d);
									System.out.println(e+"      "+f1);
									System.out.println(g+"      "+h);
									label.setText(""+b);
									label_1.setText(""+a);
									label_2.setText(""+c1);
									label_3.setText(""+d);
									label_4.setText(""+e);
									label_5.setText(""+f1);
									label_6.setText(""+g);
									label_7.setText(""+h);
									break;
								}
							}
						
								
							
						
						}catch(Exception sdfnh){}
					}
					
				});

		comboBox.setFont(new Font("Copse", Font.PLAIN, 25));
		comboBox.setBounds(394, 206, 354, 27);
		getContentPane().add(comboBox);
		
		
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(480, 606, 97, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				int a=Integer.parseInt(label.getText());
				int b=Integer.parseInt(label_1.getText());
				int c=Integer.parseInt(label_3.getText());
				int d=Integer.parseInt(label_2.getText());
				int e=Integer.parseInt(label_5.getText());
				int f=Integer.parseInt(label_4.getText());
				int g=Integer.parseInt(label_7.getText());
				int h=Integer.parseInt(label_6.getText());
				System.out.println(filen+"");
				File ff=new File(Login.Path+""+filen+".txt");
				if(ff.exists()==true)
				{
					ff.delete();
				}
				File ff1=new File(Login.Path+""+filen+".txt");
				if(ff1.exists()==false)
				{
					ff1.createNewFile();
				}
				WriteFile WW=new WriteFile(Login.Path+""+filen+".txt",true);
				WW.writeToFile(b+"    "+a);
				WW.writeToFile(d+"    "+c);
				WW.writeToFile(f+"    "+e);
				WW.writeToFile(h+"    "+g);
				lblSaved.setVisible(true);
				}catch(Exception ss){}
			}
		});
		getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1366, 768);
		Image img=new ImageIcon(this.getClass().getResource("/Chequeman_Settings1.png")).getImage();
		getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnBack.setBounds(470, 633, 117, 25);
		contentPane.add(btnBack);
		lblNewLabel.setIcon(new ImageIcon(img));
		getContentPane().add(lblNewLabel);
		
	}
	public boolean check_selection()
	{
		if(Select.equals("")==true)
		{
			lblPleaseSelectYour.setVisible(true);
			return false;
		}
		else
		{
			return true;
		}
		
	}
}
