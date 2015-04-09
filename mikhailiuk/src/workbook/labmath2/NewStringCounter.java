package workbook.labmath2;

/**
 * Created by Natashka on 16.02.2015.
 */
public class NewStringCounter {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public int newStringCounter() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n') {
                count++;
            }
        }
        return count;
    }
}
