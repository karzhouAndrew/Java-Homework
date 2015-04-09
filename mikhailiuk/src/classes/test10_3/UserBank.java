package classes.test10_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Natashka on 05.03.2015.
 */
public class UserBank {
    private List<User> userBank = new ArrayList<User>();

    public User getUser(int i) {
        return userBank.get(i);
    }

    public void fill(int usersNumber) {
        for (int i = 0; i < usersNumber; i++) {
            User user = new User();
            userBank.add(user);
        }
    }

    public void printUserList(char letter) {
        for (User user : userBank) {
            if (user.getSurname().charAt(0) == letter) {
                System.out.println(user.toString());
            }
        }
    }

    public boolean isUser(User user) {
        return userBank.contains(user);
    }


    public void printUserList() {
        for (User user : userBank) {
            System.out.println(user.toString());
        }
    }

    public void sortByName() {
        Collections.sort(userBank);
        printUserList();
    }

    public void sortByYear() {
        Collections.sort(userBank, new User());
        printUserList();
    }
}
