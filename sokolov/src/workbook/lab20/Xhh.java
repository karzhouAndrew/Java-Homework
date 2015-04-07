package workbook.lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Денис on 17.02.2015.
 */
public class Xhh {
    public static void OutputXhh(String str) {
        Pattern pattern = Pattern.compile("0[xX][0-9a-f][0-9a-f]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
