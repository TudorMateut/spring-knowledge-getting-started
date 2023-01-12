package rp.sda.dependency_injection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.sda.dependency_injection.without_di.EmailService;
import ro.sda.dependency_injection.without_di.MyOtherApplication;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LegacyTest {

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.err.println("BEFORE EACH EXECUTED");
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void legacyTest() {
        MyOtherApplication app = new MyOtherApplication(new EmailService());

        app.processMessage("ALERT", "Tudor@abc.com");

        String result = outputStream.toString();

        assertEquals("Email sent to Tudor@abc.com with message: ALERT", result);
    }

    @Test
    public void legacyTest2() {
        MyOtherApplication app = new MyOtherApplication(new EmailService());

        app.processMessage("ALERT", "Tudor@abc.com");

        String result = outputStream.toString();

        assertEquals("Email sent to Tudor@abc.com with message: ALERT", result);
    }
}
