package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Email;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Message;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_JavaMailAPI_CheckingMail extends CommonSeleniumActions implements OR {
	@Test(description = "This Procedure is to perform some input operation in 'Edit Email Template' page using JavaMail API")
	public void WC_JavaMailAPI_CheckingMail() {
		String[] testdata = datacontainer;
		String host = testdata[0];
		String username = testdata[1];
		String password = testdata[2];
		String subject = testdata[3];
		/*
		 * String host = "outlook.office365.com";// change accordingly String
		 * mailStoreType = "pop3"; 
		 * String username = "emtqaaccount@hobsons.com";// change accordingly 
		 * String password = "Hobsons22!";
		 */
		System.out.println("Enter Here");
		try
		{
			System.out.println("Enter 2");
			// create properties field
			Properties properties = new Properties();
			
			System.out.println("Enter 3");
			properties.put("mail.pop3.host", "outlook.office365.com");
			properties.put("mail.pop3.port", "587");
			properties.put("mail.pop3.starttls.enable", "true");
			Session emailSession = Session.getDefaultInstance(properties);
			System.out.println("Enter 4");
			// create the POP3 store object and connect with the pop server
			Store store = emailSession.getStore("pop3s");

			store.connect(host, username, password);
			System.out.println("Enter 5");
			// create the folder object and open it
			Folder emailFolder = store.getFolder("Inbox");
			emailFolder.open(Folder.READ_WRITE);
			Message[] messages = emailFolder.getMessages();

			System.out.println("messages.length---" + messages.length);

			int count = 0;
			for (int i = messages.length - 1; i > 0; i--) 
			{
				System.out.println("Malik");
				Message message = messages[i];
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (count++));
				System.out.println("Subject: " + message.getSubject());
				if (message.getSubject().equalsIgnoreCase(subject))
					break;
				System.out.println("From: " + message.getFrom()[0]);
				System.out.println("Time: " + message.getSentDate());
				// System.out.println("Text: " +
				// message.getContent().toString());

			}
			// close the store and folder objects
			emailFolder.close(false);
			store.close();
			System.out.println("exit");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
