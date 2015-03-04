package workbook.blinov8;

/**
 * Created by Natashka on 02.03.2015.
 */
public class StringCutter {
    public String[] cutter(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[.,\\x3f!]", "");
        return str.split("\\s");
    }
}
