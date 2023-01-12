package ro.sda.lombok;

public class Main {
    public static void main(String[] args) {

        User user = new User("Leo", "Messi", 34);

        System.out.println(user.getAge());
        System.out.println(user.getFirstName());

        user.setAge(35);
        System.out.println(user.getAge());

        System.out.println(user);

        User user1 = new User();
    }
}
