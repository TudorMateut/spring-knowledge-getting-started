package ro.sda.dependency_injection.with_di;

public class MainDIApp {
    public static void main(String[] args) {

        String msg = "ALERT";
        String mail = "Tudor@abc.com";
        String phone = "2301410240";

        MessageServiceInjector injector = null;
        Consumer consumer = null;

        injector = new EmailServiceInjector();
        consumer = injector.getConsumer();
        consumer.processMessages(msg, mail);

        injector = new SmsServiceInjector();
        consumer = injector.getConsumer();
        consumer.processMessages(msg, mail);
    }
}
