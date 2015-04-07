package workbook2.lab2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Создать программу, которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров.
 * Если входные параметры отсутствуют, программа должна выдавать сообщение на английском.
 */
public class Load {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "UK"));
        String language = "";
        String Country = "";
        try {
            if (args[0].equals("ru")) {
                language = args[0];
                Country = args[1];
            }
            if (args[0].equals("en")) {
                language = args[0];
                Country = args[1];
            }
            if (args[0].equals("be")) {
                language = args[0];
                Country = args[1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }

        Locale loc = new Locale(language,Country);
        ResourceBundle bundle = ResourceBundle.getBundle("workbook2.lab2.MessagesBundle", loc);
        System.out.println(bundle.getString("greetings"));
    }
}
