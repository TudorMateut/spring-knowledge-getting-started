package ro.sda.lombok;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    void testFirstNameReflection() throws NoSuchFieldException, IllegalAccessException {
        User user = new User();

        user.setFirstName("Leo");
        user.setLastName("Messi");

        User user1 = new User("Cristiano", "Ronaldo", 38);

        Field field = user.getClass().getDeclaredField("firstName");
        field.setAccessible(true);

        assertEquals("Leo", field.get(user));
        assertEquals("Cristiano", field.get(user1));
    }
}