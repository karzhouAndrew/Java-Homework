package classwork.collections10_3.CheckUser;

import classwork.collections10_3.Objects.User;

import java.util.Comparator;

/**
 * Created by Leonid on 09.03.2015.
 */
public class UserByLastNameComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        String str1 = user1.getLastName();
        String str2 = user2.getLastName();
        int result = str1.compareTo(str2);
        if (result == 0) {
            str1 = user1.getFirstName();
            str2 = user2.getFirstName();
            return str1.compareTo(str2);
        }
        return result;
    }
}
