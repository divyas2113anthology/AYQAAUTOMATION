/*package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Email;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;  //WC_JavaMailAPI_CheckingMail
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import org.testng.annotations.Test;
@Test

	public class WC_JavaMailAPI_CheckingMail {

	  
	public static void check() 
	   {
	      try {
	    	  String host = "outlook.office365.com";// change accordingly
		      String mailStoreType = "pop3";
		      String username = "emtqaaccount@hobsons.com";// change accordingly
		      String password = "Hobsons22!";// change accordingly

	      //create properties field
	      Properties properties = new Properties();

	      properties.put("mail.pop3.host", "outlook.office365.com");
	      properties.put("mail.pop3.port", "587");
	      properties.put("mail.pop3.starttls.enable", "true");
	      Session emailSession = Session.getDefaultInstance(properties);
	  
	      //create the POP3 store object and connect with the pop server
	      Store store = emailSession.getStore("pop3s");

	      store.connect(host, username, password);

	      //create the folder object and open it
	      Folder emailFolder = store.getFolder("Inbox");
	      emailFolder.open(Folder.READ_WRITE);
	      Message[] messages = emailFolder.getMessages();
	      //Message[] messages = emailFolder.search(new FlagTerm(new Flags(Flags.Flag.RECENT), false));
	      System.out.println("messages.length---" + messages.length);
	     // System.out.println("messages.length---" + msg.length);
	      for (int i = 0, n = msg.length; i < n; i++) {
	         Message message = msg[i];
	         //Date receivedDate = message.getReceivedDate();
	        // System.out.println("Malik --------"+receivedDate);
	         System.out.println("---------------------------------");
	         System.out.println("Email Number " + (i + 1));
	         System.out.println("Subject: " + message.getSubject());
	         if(message.getSubject().equalsIgnoreCase("Testing Subject"))
	         break;
	         System.out.println("From: " + message.getFrom()[0]);
	         System.out.println("Time: " + message.getSentDate());
	          System.out.println(message.getContentType());

	         //System.out.println("Text: " + message.getContent().toString());

	      }
//	      int count = 0;
//	      for (int i = messages.length-1; i > 0; i--) {
//		         System.out.println("Malik");
//		         Message message = messages[i];
//		         System.out.println("---------------------------------");
//		         System.out.println("Email Number " + (count++));
//		         System.out.println("Subject: " + message.getSubject());
//		         if(message.getSubject().equalsIgnoreCase("Testing Subject"))
//		         break;
//		         System.out.println("From: " + message.getFrom()[0]);
//		         System.out.println("Time: " + message.getSentDate());
//		         //System.out.println("Text: " + message.getContent().toString());
//
//		      }
	      //close the store and folder objects
//	      emailFolder.close(false);
//	      store.close();
//
//	      } catch (NoSuchProviderException e) {
//	         e.printStackTrace();
//	      } catch (MessagingException e) {
//	         e.printStackTrace();
//	      } catch (Exception e) {
//	         e.printStackTrace();
//	      }
 //}
//
//	  
//}
*/