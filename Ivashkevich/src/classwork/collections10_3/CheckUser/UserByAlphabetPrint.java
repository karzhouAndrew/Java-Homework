package classwork.collections10_3.CheckUser;

import classwork.collections10_3.Objects.User;

import java.util.List;

/**
 * Created by Leonid on 10.03.2015.
 */
public class UserByAlphabetPrint {

    public UserByAlphabetPrint(List<User> userList, String letter) {
        for (User currentUser : userList) {
            if (currentUser.getUserIndex().substring(1).equals(letter.toLowerCase())) {
                System.out.println("user_ID: " + currentUser.getUserIndex() + ", И-Ф " + currentUser.getFirstName() + "-" + currentUser.getLastName() + ", Дата рождения " + currentUser.getBirthday());
            }
        }
    }
}
