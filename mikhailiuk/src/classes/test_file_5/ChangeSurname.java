package classes.test_file_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Natashka on 11.03.2015.
 */
public class ChangeSurname {
    public String changer(String str) {
        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z]+");
        Pattern pattern1 = Pattern.compile("\\d+");
        String str1=str;
        Matcher matcher = pattern.matcher(str);
        Matcher matcher1 = pattern1.matcher(str1);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
           matcher1.find();
            String surname = matcher.group();
            int mark = Integer.parseInt(matcher1.group());
           if (mark > 7) {
                surname = surname.toUpperCase();
            }
            builder.append(surname).append(" ").append(mark).append(" ");
        }
        return builder.toString();
    }
}

