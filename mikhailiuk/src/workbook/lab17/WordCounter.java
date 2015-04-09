package workbook.lab17;

/**
 * Created by Natashka on 15.02.2015.
 */
public class WordCounter {
    private String str;

    public void setString(String str) {
        this.str = str;
    }

    public int counter() {
        int count = 1;
        str = str.trim();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
                if (str.charAt(i - 1) == ' ') {
                    count--;
                }
            }
        }
        return count;
    }

    public int counter1() {
        int count = 1;
        str = str.trim();
        char[] charArr = str.toCharArray();
        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                count++;
                if (charArr[i - 1] == ' ') {
                    count--;
                }
            }
        }
        return count;
    }

}
