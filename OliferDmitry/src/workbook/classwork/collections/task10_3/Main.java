package workbook.classwork.collections.task10_3;
// Картотека пользователей
import java.util.*;
import static workbook.classwork.collections.task10_3.UserManip.*;

public class Main {
    public static void main(String[] args) {
        int userQuantity = 7;
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < userQuantity; i++) {
            users.add(new User());
        }
        users.add(new User("Ivan", "Ivanov"));
        for (User user : users) { System.out.println(user); }
        System.out.println();

        findUserByName(users, "Ivan", "Ivanov");

        char letter = 'I';
        List<User> usersFound = findByFirstLetter(users, letter);
        System.out.println("\n-= Users found by letter \'" + letter + "\' =-");
        for (User user : usersFound) { System.out.println(user); }


        sortUsersByBirthYear(users);
        System.out.println("\n-= Users sorted by birth date =-");
        for (User user : users) { System.out.println(user); }

        sortUsersBySecondName(users);
        System.out.println("\n-= Users sorted by second name =-");
        for (User user : users) { System.out.println(user); }

    }
}
