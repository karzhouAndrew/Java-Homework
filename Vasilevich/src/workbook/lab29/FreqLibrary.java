package workbook.lab29;

import java.util.HashMap;

/**
 * Created by Sam on 04.03.2015.
 */
public class FreqLibrary {
    HashMap<String, Integer> stringArr;

    public FreqLibrary(String text) {
        stringArr = new HashMap<String, Integer>();
        String[] splitStr = text.split(" +");
        for (String strVal : splitStr) {
            if (stringArr.containsKey(strVal)) {
                Integer counter = stringArr.get(strVal);
                stringArr.put(strVal, ++counter);
            } else {
                stringArr.put(strVal, 1);
            }
        }
    }

    @Override
    public String toString() {
        return "FreqLibrary{" +
                "stringArr=" + stringArr +
                '}';
    }
}
