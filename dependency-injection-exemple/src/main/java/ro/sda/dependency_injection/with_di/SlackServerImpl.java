package ro.sda.dependency_injection.with_di;

public class SlackServerImpl implements MessageService{
    @Override
    public void sendMessage(String msg, String rcv) {
        //logic to send message on Slack
        System.out.print("Slack message sent to " + rcv + " with message: " + msg);
    }
}
