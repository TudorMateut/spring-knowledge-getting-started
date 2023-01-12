package rp.sda.dependency_injection;

import org.junit.jupiter.api.Test;
import ro.sda.dependency_injection.with_di.MessageService;
import ro.sda.dependency_injection.with_di.MyDIApplication;

public class DummyTest {
    @Test
    public void dummyTest() {

        MyDIApplication myDIApplication = new MyDIApplication(new MessageService() {
            @Override
            public void sendMessage(String msg, String rcv) {
                System.out.println("MOCK MESSAGE SENT");
            }
        });

        MyDIApplication myDIApplication2 = new MyDIApplication((msg, rcv) -> System.out.println("MOCK MESSAGE SENT"));

        myDIApplication.processMessages("abc", "abc@abc.com");
    }
}
