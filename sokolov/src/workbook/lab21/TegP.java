package workbook.lab21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Денис on 17.02.2015.
 */
public class TegP {
    public static String replace(String str) {
        return str.replaceAll("<p[^>]+>", "<p>");
    }

    public static void change(String str) {
        Pattern pattern = Pattern.compile("<p[^>]+>");
        Matcher matcher = pattern.matcher(str);
        int n = 0;
        while (matcher.find()) {
            n++;
            System.out.print("Tag with parameters №" + n + ": ");
            System.out.println(matcher.group());
        }
    }
}
