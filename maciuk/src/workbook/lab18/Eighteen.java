package workbook.lab18;

/**
 * Created by Asus on 21.02.2015.
 */
public class Eighteen {
    public static void main(String[] args) {
        String str = "  Работа со  строками  и без";
        char c = ' ';
        int p = 0;
        while (p != -1) {
            p = str.indexOf(' ', p);
            if (p != -1) {
                if (p > 0 && c != str.charAt(p - 1)) {
                    System.out.print(str.charAt(p - 1));
                    p++;
                }
                if (p == 0  || c == str.charAt(p - 1)) {
                    p++;
                }
            }
        }
        int t = str.length() - 1;
        if (c != str.charAt(t)) {
            System.out.print(str.charAt(t));
        }
    }
}

