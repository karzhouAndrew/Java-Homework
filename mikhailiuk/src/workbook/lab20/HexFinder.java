package workbook.lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Natashka on 17.02.2015.
 */
public class HexFinder {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void hexFinder() {
        Pattern patternHex = Pattern.compile("0x[0-9a-f]+");
        Matcher matcher = patternHex.matcher(str);
        do {
            matcher.find();
            System.out.println(matcher.group());
        } while (matcher.find()==true);
    }
}
