package workbook2.lab2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Menu {

    public static void menu() {
        System.out.println("1. Поприветствовать на английском языке. ");
        System.out.println("2. Поприветствовать на русском языке. ");
        System.out.println("3. Поприветствовать на белорусском языке. ");
        System.out.println("4. Поприветствовать на языке по умолчанию. ");
        System.out.println("5. Выход. ");
    }

    public void getMenu() {
        menu();
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Выберите пункт меню: ");
            String inputNumber = in.next();
            Locale locale = Locale.getDefault().ENGLISH;
            if (inputNumber.equals("1")) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle("workbook2.lab2.MessagesBundle", new Locale("en", "US"));
                String greeting = resourceBundle.getString("greeting");
                System.out.println(greeting);
                continue;
            }
            if (inputNumber.equals("2")) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle("workbook2.lab2.MessagesBundle", new Locale("ru", "RU"));
                String greeting = resourceBundle.getString("greeting");
                System.out.println(greeting);
                continue;
            }
            if (inputNumber.equals("3")) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle("workbook2.lab2.MessagesBundle", new Locale("be", "BY"));
                String greeting = resourceBundle.getString("greeting");
                System.out.println(greeting);
                continue;
            }
            if (inputNumber.equals("4")) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle("workbook2.lab2.MessagesBundle", locale);
                String greeting = resourceBundle.getString("greeting");
                System.out.println(greeting);
                continue;
            }
            if (inputNumber.equals("5")) {
                break;
            } else {
                System.out.println("--------------------------");
                System.out.println("Введите корректные данные.");
                System.out.println("--------------------------");
                continue;
            }
        }
    }
}
