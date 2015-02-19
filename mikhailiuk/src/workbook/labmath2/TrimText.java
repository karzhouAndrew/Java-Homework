package workbook.labmath2;

/**
 * Created by Natashka on 16.02.2015.
 */
public class TrimText {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void printSentence() {
        int count = 0;
        char[] arr = str.toCharArray();
        for (char x : arr) {
            if (x == '.') {
                System.out.print(x);
                System.out.println(count);
                count = 0;
                continue;
            } else if (x == '?') {
                System.out.print(x);
                System.out.println(count);
                count = 0;
                continue;
            } else if (x == '!') {
                System.out.print(x);
                System.out.println(count);
                count = 0;
                continue;
            }
            System.out.print(x);
            count++;
        }
    }
}
