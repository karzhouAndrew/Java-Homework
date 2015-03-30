// Создать программу, которая может приветствовать пользователя на 3-х языках. Язык и страна должны сообщаться программе
// в качестве входных параметров. Если входных параметров нет, то программа должна приветствовать на английском.
package workbook2.workbook2Tasks.task2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            hello(args[0]);
        } else if (args.length == 0) {
            hello();
        }
    }

    public static void hello(String lang) {
        String lower = lang.toLowerCase();
        if (lower.equals("be") || lower.equals("by") || lower.equals("blr") || lower.equals("belarus")) {
            Locale locBY = new Locale("be", "BY");
            ResourceBundle bundleBY = ResourceBundle.getBundle("workbook2.workbook2Tasks.task2.MessagesBundle", locBY);
            System.out.println(bundleBY.getString("hello"));
        } else if (lower.equals("ru") || lower.equals("rus") || lower.equals("russia")) {
            Locale locRU = new Locale("ru", "RU");
            ResourceBundle bundleRU = ResourceBundle.getBundle("workbook2.workbook2Tasks.task2.MessagesBundle", locRU);
            System.out.println(bundleRU.getString("hello"));
        }
    }

    public static void hello() {
        Locale locUS = new Locale("en", "US");
        ResourceBundle bundleUS = ResourceBundle.getBundle("workbook2.workbook2Tasks.task2.MessagesBundle", locUS);
        System.out.println(bundleUS.getString("hello"));
    }
}
