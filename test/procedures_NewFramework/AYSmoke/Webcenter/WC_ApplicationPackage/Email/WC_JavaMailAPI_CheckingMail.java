package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Email;

import java.util.Properties;


import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;  //WC_JavaMailAPI_CheckingMail
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import org.testng.annotations.Test;

@Test(description="This Procedure is to perform some input operation in 'Edit Email Template' page")
public class WC_JavaMailAPI_CheckingMail 
{

	String host = "outlook.office365.com";// change accordingly
	String mailStoreType = "pop3";
	String username = "emtqaaccount@hobsons.com";// change accordingly
	String password = "Hobsons22!";
	{

	try 
	{

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

		System.out.println("messages.length---" + messages.length);

		int count = 0;
		for (int i = messages.length-1; i > 0; i--) 
		{
			System.out.println("Malik");
			Message message = messages[i];
			System.out.println("---------------------------------");
			System.out.println("Email Number " + (count++));
			System.out.println("Subject: " + message.getSubject());
			if(message.getSubject().equalsIgnoreCase("Testing Subject"))
				break;
			System.out.println("From: " + message.getFrom()[0]);
			System.out.println("Time: " + message.getSentDate());
			//System.out.println("Text: " + message.getContent().toString());

		}
		//close the store and folder objects
		emailFolder.close(false);
		store.close();

	} 
	catch (NoSuchProviderException e) {
		e.printStackTrace();
	} 
	catch (MessagingException e1) {
		e1.printStackTrace();
	}
	catch (Exception e2) {
		e2.printStackTrace();
	}
}
}


