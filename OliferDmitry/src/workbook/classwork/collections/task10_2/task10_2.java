package workbook.classwork.collections.task10_2;

import java.util.Arrays;

public class task10_2 {
    public static void main(String[] args) {
        String[] strArray = {"Minsk", "Warsawa", "Kiev", "Tallinn", "Riga", "Vilnius"};
        StringArrayIterator strIter = new StringArrayIterator(strArray);
        System.out.println(Arrays.toString(strArray));
        while (strIter.hasNext()) {
            String str = strIter.next();
            if (str.equals("Warsawa")) {
                strIter.remove();
            }
        }
        strArray = strIter.getStrArray(); // ochen' koriavaja stroka, no bez nee nikak ne poluchaetsa
        System.out.println(Arrays.toString(strArray));

    }
}
