package workbook.blinov4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Natashka on 20.02.2015.
 */
public class SetLengthPrint {

    public void setLengthPrint(String str, int length) {
        Set<String> printWord = new HashSet<String>();
        str=str.toLowerCase();
        str = str.replaceAll(",", "");
        str = str.replaceAll("\\x3f", "??");
        String[] sentences = str.split("[.!\\x3f][\\s]");
        for (String sent : sentences) {
            if (sent.endsWith("?")) {
                String[] words = sent.split("\\s");
                for (String word : words) {
                    if (word.length() == length) {
                        printWord.add(word);
                    }
                }
            }
        }
        System.out.println(printWord);
    }
}
