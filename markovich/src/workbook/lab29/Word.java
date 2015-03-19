package workbook.lab29;

import java.util.Map;
import java.util.TreeMap;

public class Word {
    public static Map<String, Integer> wordsCounter(String string) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String splitWords[] = string.split(" +");
        for (String word : splitWords) {
            if (map.containsKey(word)) {
                Integer counterWord = map.get(word);
                map.put(word, ++counterWord);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
