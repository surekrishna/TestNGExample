package com.testng;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SendMail {

	public static void main(String[] args) throws EmailException {
		// Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("mypictures/john.jpg");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Picture of John");
		  attachment.setName("John");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("gamilid", "password"));
		  email.setSSLOnConnect(true);
		  email.setFrom("user@gmail.com");
		  email.setSubject("TestMail");
		  email.setMsg("This is a test mail ... :-)");
		  email.addTo("foo@bar.com");

		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();

	}

}
