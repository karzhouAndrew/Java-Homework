package classwork.collections10_3.CheckUser;

import classwork.collections10_3.Objects.User;

import java.util.Comparator;

/**
 * Created by Leonid on 09.03.2015.
 */
public class UserByYearOfBirthComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        String str1 = user1.getBirthday();
        String str2 = user2.getBirthday();
        return str1.substring(6).compareTo(str2.substring(6));
    }
}
