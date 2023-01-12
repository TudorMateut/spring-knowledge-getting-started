package ro.sda.dependency_injection.without_di;

public class EmailService {
    public void sendEmail(String message, String receiver) {
        //logic to send email
        System.out.print("Email sent to " + receiver + " with message: " + message);
    }
}
