import service.Gender;
import service.UsersInfo;

import java.util.Arrays;

/**
 * description:
 *
 * @author: ahoo
 * @date: 2021/4/8
 */
public class demo1 {
    public static void main(String[] args) {
        UsersInfo usersInfo1 = new UsersInfo();

        usersInfo1.setName("ahoo");
        usersInfo1.setAge(34);
        usersInfo1.setGender(Gender.MALE.toString());

        System.out.println("the user1 name is: " + usersInfo1.getName());
        System.out.println("the user1 gender is: " + usersInfo1.getGender());
        System.out.println("the user1 age is: " + usersInfo1.getAge());

        UsersInfo usersInfo2 = new UsersInfo();
        usersInfo2.setName("rose");
        usersInfo2.setAge(28);
        usersInfo2.setGender(Gender.FEMALE.toString());

        System.out.println("the user1 name is: " + usersInfo2.getName());
        System.out.println("the user1 gender is: " + usersInfo2.getGender());
        System.out.println("the user1 age is: " + usersInfo2.getAge());

        System.out.println("values of enum Gender is: " + Arrays.asList(Gender.values()));
        System.out.println("LOVE");

        // dev03 modify
    }
}
