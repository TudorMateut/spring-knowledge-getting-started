package ro.sda.dependency_injection.with_di;

public class SmsServiceImpl implements MessageService{

    @Override
    public void sendMessage(String msg, String rcv) {
        System.out.print("SMS sent to " + msg + " with message: " + msg);
    }
}
