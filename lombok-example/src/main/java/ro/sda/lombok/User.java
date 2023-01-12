package ro.sda.lombok;

import lombok.*;

//@Data --> is a shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;

    //ctrl + shift + t --> for generating a test class
}
