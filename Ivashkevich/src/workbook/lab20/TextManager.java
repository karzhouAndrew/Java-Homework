package workbook.lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Leonid on 22.02.2015.
 */
public class TextManager {

    public void searchHex(String text) {
        Pattern pattern = Pattern.compile("0x\\p{XDigit}+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
