package ro.sda.dependency_injection.with_di;

public class EmailServiceImpl implements MessageService{
    @Override
    public void sendMessage(String msg, String rcv) {
        System.out.print("Email sent to " + rcv + " with message: " + msg);
    }
}
