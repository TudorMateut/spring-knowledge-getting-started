package ro.sda.dependency_injection.without_di;

public class MyOtherApplication {
    private EmailService emailService;

    public MyOtherApplication(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processMessage(String msg, String rcv) {
        this.emailService.sendEmail(msg, rcv);
    }
}
