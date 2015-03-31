package classwork.collections10_3;

import classwork.collections10_3.CheckUser.*;
import classwork.collections10_3.Objects.User;
import classwork.collections10_3.Utils.CheckUser;

import java.util.*;

/**
 * Created by Leonid on 10.03.2015.
 */
public class UserBaseProcessor {
    public void baseProcessor() {

        List<User> userList = new ArrayList<User>();
        inputUser(userList);
        Scanner input = new Scanner(System.in);
        menu();

        for (; ; ) {
            System.out.print("что делаем?_");
            String inputNumber = input.next();
            if (inputNumber.equals("1")) {
                System.out.println("Сортировка по имени: ");
                Collections.sort(userList, new UserByNameComparator());
                printResult(userList);
                continue;
            }
            if (inputNumber.equals("2")) {
                System.out.println("Сортировка по фамилии: ");
                Collections.sort(userList, new UserByLastNameComparator());
                printResult(userList);
                continue;
            }
            if (inputNumber.equals("3")) {
                System.out.println("Сотрировка по году рождения: ");
                Collections.sort(userList, new UserByYearOfBirthComparator());
                printResult(userList);
                continue;
            }
            if (inputNumber.equals("4")) {
                System.out.println("Сотрировка по первой букве фамилии: ");
                new UserByAlphabetPrint(userList, input.next());
                continue;
            }
            if (inputNumber.equals("5")) {
                System.out.println("Проверка наличия пользователя: ");
                if (CheckUser.checkAvailableUsers(userList, input.next())) {
                    System.out.println("Есть в системе");
                } else {
                    System.out.println("Нет в системе");
                }
                continue;
            }
            if (inputNumber.equals("6")) {
                inputUser(userList);
                continue;
            }
            if (inputNumber.equals("menu")) {
                menu();
                continue;
            }
            if (inputNumber.equals("7")) {
                break;
            }
        }
        input.close();
    }

    private static void printResult(List<User> userList) {
        for (User currentUser : userList) {
            System.out.println("user_ID: " + currentUser.getUserIndex() + ", И-Ф " + currentUser.getFirstName() + "-" + currentUser.getLastName() + ", Дата рождения " + currentUser.getBirthday());
        }
    }

    private static void menu() {
        System.out.println("Сортировать по имени 1");
        System.out.println("Сортировать по фамилии 2");
        System.out.println("Сортировать по году рождения 3");
        System.out.println("Сортировать по первой букве фамилии 4");
        System.out.println("Проверить наличие пользователя 5");
        System.out.println("Добавить пользователя 6");
        System.out.println("Закончить работу 7");
    }

    public static void inputUser(List<User> userList) {
        Scanner input = new Scanner(System.in);
        int index = userList.size();
        for (; ; ) {
            User user = new User();
            System.out.print("Имя: ");
            user.setFirstName(input.next());
            System.out.print("Фамилия: ");
            user.setLastName(input.next());
            index++;
            user.setUserIndex(index + user.getLastName().substring(0, 1).toLowerCase());
            System.out.print("Дата рождения(ДД.ММ.ГГГГ): ");
            user.setBirthday(input.next());
            userList.add(user);
            System.out.println("Ввести данные нового пользователя?");
            System.out.print("y/n: ");
            if (input.next().equals("n")) {
                break;
            }
        }
    }
}
