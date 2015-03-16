package workbook2.lab2;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static String PATH_FILE = "workbook2.lab2.MessagesBundle";

    public static void menu() {
        System.out.println("-------------------------------------------");
        System.out.println("1. Поприветствовать на английском языке. ");
        System.out.println("2. Поприветствовать на русском языке. ");
        System.out.println("3. Поприветствовать на белорусском языке. ");
        System.out.println("4. Поприветствовать на языке по умолчанию. ");
        System.out.println("5. Выход. ");
        System.out.println("-------------------------------------------");
    }

    public void getMenu() {
        String inputNumber;
        Scanner in = new Scanner(System.in);
        menu();
        do {
            System.out.println("Выберите пункт меню: ");
            inputNumber = in.next();
            Locale locale = Locale.getDefault();
            if (inputNumber.equals("1")) {
                PrintUnit.printMessage(PATH_FILE, new Locale("en", "US"));
            }
            if (inputNumber.equals("2")) {
                PrintUnit.printMessage(PATH_FILE, new Locale("ru", "RU"));
            }
            if (inputNumber.equals("3")) {
                PrintUnit.printMessage(PATH_FILE, new Locale("be", "BY"));
            }
            if (inputNumber.equals("4")) {
                PrintUnit.printMessage(PATH_FILE, locale);
            }
        } while (!inputNumber.equals("5"));
    }
}