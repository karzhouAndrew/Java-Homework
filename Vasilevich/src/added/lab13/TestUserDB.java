package added.lab13;

import java.util.*;

/**
 * Created by vasilevich on 10.03.2015.
 * Кортотека пользователей
 * Каждый пользователь хранит имя, фамилию, дату рождения, и ID
 */
public class TestUserDB {
    public static void main(String[] args) {
        UserDB userDB = new UserDB();
        Calendar calendar = Calendar.getInstance();
        Random random = new Random();

        int userCount = 5;
        for (int userInd = 0; userInd < userCount; userInd++) {
            calendar.set(1970 + random.nextInt(20), random.nextInt(12) + 1, random.nextInt(31));
            userDB.addUser(FirstNameEnum.generateFirstName(), LastNameEnum.generateLastName(), calendar.getTime());
        }
        System.out.println(userDB);

        Set<User> users = userDB.orderUserByFirstName();
        System.out.println("Ordered by First Name = \n" + users);

        users = userDB.orderUserByLastName();
        System.out.println("Ordered by Last Name = \n" + users);

        users = userDB.orderUserByBirthYear();
        System.out.println("Ordered by Birth year = \n" + users);

        List<User> userList = userDB.searchFistItemInLastName("a");
        System.out.println("User list with A = " + userList);
    }
}
