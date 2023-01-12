package ro.sda.dependency_injection.with_di;

public class SmsServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SmsServiceImpl());
    }
}
