package workbook.classwork.collections.task10_3;

import java.util.*;

public class UserManip {

    public static void findUserByName (List<User> users, String firstName, String secondName) {
        for (User user : users) {
            if (user.getFirstName().toUpperCase().equals(firstName.toUpperCase()) &&
                user.getSecondName().toUpperCase().equals(secondName.toUpperCase()) ) {
                System.out.println("User found:\n" + user);
            }
        }
    }

    public static List<User> findByFirstLetter (List<User> users, char ch) {
        List<User> usersFound = new ArrayList<User>();
        String firstLetter = ("" + ch).toLowerCase();
        for (User user : users) {
            if (user.getId().startsWith(firstLetter)) {
                usersFound.add(user);
            }
        }
        return usersFound;
    }

    public static void sortUsersByBirthYear (List<User> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i ; j++) {
                if (list.get(j - 1).getBirth().compareTo(list.get(j).getBirth()) > 0) {
                    User temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
    }

    public static void sortUsersBySecondName (List<User> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i ; j++) {
                if (list.get(j - 1).getSecondName().compareTo(list.get(j).getSecondName()) > 0) {
                    User temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
    }

}
