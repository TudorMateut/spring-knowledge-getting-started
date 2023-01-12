package ro.sda.dependency_injection.without_di;

public class Main {
    public static void main(String[] args) {

        MyApplication app = new MyApplication();
        app.processMessage("ALERT", "Tudor@abc.com");


    }
}
