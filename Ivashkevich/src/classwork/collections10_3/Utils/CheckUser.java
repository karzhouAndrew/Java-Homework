package classwork.collections10_3.Utils;

import classwork.collections10_3.Objects.User;

import java.util.List;

/**
 * Created by Leonid on 06.03.2015.
 */
public class CheckUser {
    private CheckUser() {
    }

    public static boolean checkAvailableUsers(List<User> array, String value) {
        for (User currentUser : array) {
            if (currentUser.getFirstName().equals(value)) {
                return true;
            }
            if (currentUser.getLastName().equals(value)) {
                return true;
            }
            if (currentUser.getBirthday().equals(value)) {
                return true;
            }

            if (currentUser.getUserIndex().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
