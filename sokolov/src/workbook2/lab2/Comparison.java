package workbook2.lab2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Comparison {
    private Locale russian = new Locale("ru", "RU");
    private Locale belarussian = new Locale("be", "BE");
    private Locale english = new Locale("en", "EN");

    public void setStrings() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", english);
        System.out.println(resourceBundle.getString("greetings"));
    }

    public void setStrings(String s1) {
        if (s1.equals("ru") || s1.equals("RU")) {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", russian);
            System.out.println(resourceBundle.getString("greetings"));
        } else {
            if (s1.equals("be") || s1.equals("BE")) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", belarussian);
                System.out.println(resourceBundle.getString("greetings"));
            } else {
                if (s1.equals("en") || s1.equals("EN")) {
                    ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", english);
                    System.out.println(resourceBundle.getString("greetings"));
                } else {
                    System.out.println("Not the correct input format. Example: <be> or <BE> ");
                }
            }
        }
    }

    public void setStrings(String s1, String s2) {
        if (s1.equals("ru") || s2.equals("RU")) {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", russian);
            System.out.println(resourceBundle.getString("greetings"));
        } else {
            if (s1.equals("be") || s2.equals("BE")) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", belarussian);
                System.out.println(resourceBundle.getString("greetings"));
            } else {
                if (s1.equals("en") || s2.equals("EN")) {
                    ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", english);
                    System.out.println(resourceBundle.getString("greetings"));
                } else {
                    setStringsExcess();
                }
            }
        }
    }

    public void setStringsExcess() {
        System.out.println("Not the correct input format. Example: <be> <BE> ");
    }
}
