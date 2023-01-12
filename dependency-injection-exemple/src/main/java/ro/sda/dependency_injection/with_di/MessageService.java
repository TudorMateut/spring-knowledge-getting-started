package ro.sda.dependency_injection.with_di;

@FunctionalInterface
public interface MessageService {
    void sendMessage(String msg, String rcv);
}
