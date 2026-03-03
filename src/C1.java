import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.File;
/**
 * This class is used to modify an existing pdf file using iText jar.
 * @author Parth Shah
 */
public class C1 
{
	static String AmtWords="";
	static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy hh-mm-ss");
	static Calendar cal = Calendar.getInstance();
	public void PDFMaker(String Date, String Name, String Amt,String filen)throws PrintException, IOException 
	{
		try {
			File file11 = new File("C:\\Prominer");
	        if (!file11.exists()) {
	            if (file11.mkdir()) {
	                System.out.println("Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }
			
			File ff=new File("C:/Prominer/"+filen+".txt");
			if(ff.exists()==false)
			{
				ff.createNewFile();
			}
			ReadFile file=new ReadFile("C:/Prominer/"+filen+".txt");
			String s[]=file.OpenFile();
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
			System.out.println(a+"   P   "+b);
			System.out.println(c1+"  P    "+d);
			System.out.println(e+"   P   "+f1);
			System.out.println(g+"   P   "+h);
		
			for(int j=0;j<1;j++)
			{
				//Create PdfReader instance.
				PdfReader pdfReader = 
						new PdfReader("Blankk.pdf");
				
				
		
				String timee=dateFormat.format(cal.getTime());
				//Create PdfStamper instance.
				PdfStamper pdfStamper = new PdfStamper(pdfReader,
				   new FileOutputStream("C:/Users/"+System.getProperty("user.name")+"/Desktop/"+timee+""+".pdf"));
				Chequeman.time=timee;
				//Create BaseFont instance.
				BaseFont baseFont = BaseFont.createFont(
		                BaseFont.COURIER_BOLD,
		                BaseFont.CP1252, BaseFont.EMBEDDED);
				
				//Get the number of pages in pdf.
				int pages = pdfReader.getNumberOfPages(); 
				
						for(int i=1; i<=pages; i++) { 
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 12);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Date+"");
							
							pageContentByte.endText();
						}
	
						for(int i=1; i<=pages; i++) { 
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 12);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(c1,d);				
							//Write text
							pageContentByte.showText("**"+Name+"**");
							pageContentByte.endText();
						}
						try{
						C3 cc=new C3();
						cc.Mainy(Long.parseLong(Amt));
						}catch(Exception sefs){}
						String Amt1=AmtWords;
						if(Amt1.length()==40)
						{
							for(int i=1; i<=pages; i++) { 
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 12);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(e,f1);				
								//Write text
								pageContentByte.showText("**"+Amt1+"Only**");
								System.out.println("**"+Amt1+"Only**");
								pageContentByte.endText();
							}
						}
						else
						{
							String G="**"+Amt1;
							String G2="";String G1="";
							int count=0;
							for(int i=G.length()-1;i>=0;i--)
							{
								char c=G.charAt(i);
								if(i<41)
								{
									if(c==' ' && count==0)
									{
										count++;
									}
									else if(c!=' ' && count==0)
									{
										G2+=c;
									}
									else if(c==' ' && count!=0)
									{
										G1+=c;
										
									}
									else if(c!=' ' && count!=0)
									{
										G1+=c;
									}
								
									
								}
								else
								{
									G2+=c;
								}
								
							}
							G2=G2.trim();
							G1=G1.trim();
							if(G2!=null)
							{
								G2="**ylnO "+G2;
							}
							else
							{
								G1="**ylnO "+G1;
							}
							
							StringBuffer Se=new StringBuffer(G1);
							
							StringBuffer Se1=new StringBuffer(G2);
						
	
							
							for(int i=1; i<=pages; i++) { 
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 12);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(e,f1);				
								//Write text
								pageContentByte.showText(Se.reverse()+"");
							
								pageContentByte.endText();
							}
							for(int i=1; i<=pages; i++) { 
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 12);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(e,f1-26);				
								//Write text
								pageContentByte.showText(Se1.reverse()+"");
								System.out.println(Se1.reverse()+"");
								pageContentByte.endText();
							}
							
						}
						
	
						

						for(int i=1; i<=pages; i++) { 
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 12);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(g,h);				
							String dem=Amt;
							String Revised="";
							int len=dem.length();
							if(len<5)
							{
								Revised=Amt;
							}
							else if(len==5)
							{
								int count=0;
								for(int k=0;k<len;k++)
								{
									count++;
									char f=dem.charAt(k);
									if(count==3)
									{
										Revised+=","+f;
									}
									else
									{
										Revised+=f;
									}
									
								}
							}
							else if(len==6)
							{
								int count=0;
								for(int k=0;k<len;k++)
								{
									count++;
									char f=dem.charAt(k);
									if(count==4 || count==2)
									{
										Revised+=","+f;
									}
									else
									{
										Revised+=f;
									}
									
								}
							}
							else if(len==7)
							{
								int count=0;
								for(int k=0;k<len;k++)
								{
									count++;
									char f=dem.charAt(k);
									if(count==3 || count==5)
									{
										Revised+=","+f;
									}
									else
									{
										Revised+=f;
									}
									
								}
							}
							else if(len==8)
							{
								int count=0;
								for(int k=0;k<len;k++)
								{
									count++;
									char f=dem.charAt(k);
									if(count==2 || count==4 || count==6)
									{
										Revised+=","+f;
									}
									else
									{
										Revised+=f;
									}
									
								}
							}
							pageContentByte.showText(Revised+"/-**");
							pageContentByte.endText();
						}
				//Close the pdfStamper.
						pdfStamper.close();			
				System.out.println("PDF modified successfully.");

			}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}