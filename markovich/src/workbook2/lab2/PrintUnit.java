package workbook2.lab2;

import java.util.Locale;
import java.util.ResourceBundle;

public class PrintUnit {

    private static String PATH_FILE = "workbook2.lab2.MessagesBundle";

    private static void printMessage(String path, Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(path, locale);
        System.out.println(resourceBundle.getString("greeting"));
    }

    public static void chooseLanguages(String number) {
        if (number.equals("1")) {
            printMessage(PATH_FILE, new Locale("en", "US"));
        }
        if (number.equals("2")) {
            printMessage(PATH_FILE, new Locale("ru", "RU"));
        }
        if (number.equals("3")) {
            printMessage(PATH_FILE, new Locale("be", "BY"));
        }
        if (number.equals("4")) {
            printMessage(PATH_FILE, Locale.getDefault());
        }
    }
}