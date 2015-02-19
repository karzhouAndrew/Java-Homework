package workbook.lab16;

/**
 * Created by Natashka on 15.02.2015.
 */
public class PunctuationSearch {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public int search() {
        int counter = 0;
        char[] arr = {',', '.', '!', '?', '\'', '"', ':', ';', '(', ')', '-'};
        for (char x : arr) {
            int index = 0;
            while (index != -1) {
                index = str.indexOf(x, index);
                if (index != -1) {
                    index++;
                    counter++;
                }
            }
        }
        return counter;
    }
}
