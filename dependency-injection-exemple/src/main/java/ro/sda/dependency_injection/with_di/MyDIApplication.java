package ro.sda.dependency_injection.with_di;

public class MyDIApplication implements Consumer{
    private MessageService service;

    public MyDIApplication(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
