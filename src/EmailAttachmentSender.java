import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
 





import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
 
public class EmailAttachmentSender {
	static int countt=0;
	
    public static void sendEmailWithAttachments(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message)
            throws AddressException, MessagingException, UnsupportedEncodingException {
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
 
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(userName, "Prominer London"));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        
        
        
        Multipart multipart = new MimeMultipart();
        BodyPart messageBodyPart = new MimeBodyPart();
        String htmlText = "<H1>Universal Cheque Printing Software | Digital India</H1><img src=\"cid:image\">";
        messageBodyPart.setContent(htmlText, "text/html");
        // add it
        
        
        messageBodyPart = new MimeBodyPart();
        DataSource fds = new FileDataSource(
         "C:/Users/Parth Shah/Desktop/Box Design_India_Final.png");

        messageBodyPart.setDataHandler(new DataHandler(fds));
        messageBodyPart.setHeader("Content-ID", "<image>");
        multipart.addBodyPart(messageBodyPart);
        msg.setContent(multipart);
     //   msg.setContent("[04:28:21 16/12/2016] End of message.", "htmlText");
        
        // sends the e-mail
        Transport.send(msg);
 
    }
 
    /**
     * Test sending e-mail with attachments
     */
    public static void main(String args[]) {
        // SMTP info
    	String Email="prominergroup@gmail.com";
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "parth.prs.shah@gmail.com";;
        String password = "P@$$|/|/()Rd2";
 
        // message info
 
        	String mailTo = Email;
        	String subject = "Email Check";
            String message = "";
            try {
                sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
                    subject, message);
                System.out.println("Email sent.");
            } catch (Exception ex) {
                System.out.println("Could not send email.");
                ex.printStackTrace();
           
            }
    }
}


