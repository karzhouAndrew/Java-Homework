package workbook.test6_10;

import workbook.blinov8.StringCutter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Natashka on 04.03.2015.
 */
public class FreqDictTest {
    public static void main(String[] args) {
        String str = "да нет что! нет да? где что. кто где как, что нет.";
        StringCutter stringCutter = new StringCutter();
        String[] words = stringCutter.cutter(str);
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (dictionary.containsKey(words[i])) {
                int wordNumber = dictionary.get(words[i]);
                dictionary.put(words[i], ++wordNumber);
            } else {
                dictionary.put(words[i], 1);
            }
        }
        System.out.println(dictionary);
    }
}
