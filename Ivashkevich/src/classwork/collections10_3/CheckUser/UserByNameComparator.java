package classwork.collections10_3.CheckUser;

import classwork.collections10_3.Objects.User;

import java.util.Comparator;

/**
 * Created by Leonid on 08.03.2015.
 */
public class UserByNameComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        String str1 = user1.getFirstName();
        String str2 = user2.getFirstName();
        int result = str1.compareTo(str2);
        if (result == 0) {
            str1 = user1.getLastName();
            str2 = user2.getLastName();
            return str1.compareTo(str2);
        }
        return result;
    }
}
