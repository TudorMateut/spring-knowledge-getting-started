package rp.sda.dependency_injection;

import ro.sda.dependency_injection.with_di.MessageService;

public class MockMessageService implements MessageService {
    @Override
    public void sendMessage(String msg, String rcv) {
        System.out.println("MOCK MESSAGE SENT");
    }
}
