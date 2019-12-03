import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    
class Mailer{  
    public static void send(String from,String password,String to,String sub,String msg){  
          //Get properties object    
            
         
          Properties props = new Properties();
          props.put("mail.smtp.user", "email@gmail.com");
         
        
          props.put("mail.smtp.starttls.enable","true");
          props.put("mail.smtp.debug", "true");
         
        
          props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
          props.put("mail.smtp.socketFactory.fallback", "false");
          
      
          
          
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465"); 
          SMTPAuthenticator auth = new SMTPAuthenticator();
          //get Session   
          Session session = Session.getDefaultInstance(props,auth);    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);    
           message.setText(msg);    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  
}  
public class TestEmail{    
 public static void main(String[] args) {    
     //from,password,to,subject,message  
     Mailer.send("from@gmail.com","xxxxx","to@gmail.com","hello,Welcome to java mail","How r u?");  
     //change from, password and to  
 }    
}    