package bloodbank;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;




public class MailSender {
    final String username;
    final String password;
    String host;
    Properties properties;
    Session session;
    MimeMessage message;

    public MailSender() {
        username = "bloodbanknotification@gmail.com";
        password = "notifydonors";
        host = "localhost";
        properties = new Properties();
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        session = Session.getInstance(properties,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try{
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setSubject("Notification from Blood Bank");
            message.setText("Dear Donor,\n" +
"Ninety days have passed since your last donation; now you can start donating again. Please visit us at any of our branches on our working days: Sunday - Thursday from 9 AM - 5 PM.\n" +
"\n" +
"Regards,\n" +
"Blood Bank Administration.");
        }
        catch (MessagingException mex) {
         mex.printStackTrace();
            }
    }
    
    public void send(String to){
        try {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                Transport.send(message);
                System.out.println("Message sent to : " +to);
        }
        catch (MessagingException mex) {
         mex.printStackTrace();
            }
    }
    
}
