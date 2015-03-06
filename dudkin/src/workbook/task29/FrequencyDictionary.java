package workbook.task29;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String str = "I study Map study I study Map Map Map";
        String[] newStr = str.split(" ");
        for (int i = 0; i < newStr.length; i++) {
            if (map.containsKey(newStr[i])) {
                int counter = map.get(newStr[i]);
                map.put(newStr[i], ++counter);
            } else map.put(newStr[i], 1);
        }
        System.out.println(map);
    }
}
