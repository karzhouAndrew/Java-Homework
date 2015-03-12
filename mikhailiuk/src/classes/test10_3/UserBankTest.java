package classes.test10_3;

/**
 * Created by Natashka on 05.03.2015.
 */
public class UserBankTest {
    public static void main(String[] args) {
        UserBank userBank = new UserBank();
        userBank.fill(10);
        userBank.printUserList();
        System.out.println("__________________________________");
        userBank.printUserList('W');
        System.out.println("__________________________________");
        User user=new User();
        System.out.println(userBank.isUser(user));
        System.out.println(userBank.isUser(userBank.getUser(3)));
        System.out.println("__________________________________");
        userBank.sortByYear();
        System.out.println("__________________________________");
        userBank.sortByName();
    }
}
