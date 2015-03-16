package workbook2.lab2;

import java.util.Locale;
import java.util.ResourceBundle;

public class PrintUnit {
    public static void printMessage(String path, Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(path, locale);
        System.out.println(resourceBundle.getString("greeting"));
    }
}
