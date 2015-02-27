package workbook.lab26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Asus on 21.02.2015.
 */
public class Valid {
    public static void main(String[] args) {
        String str = "( ( )) (()()) ";
        int p = 0;
        int n = 0;
        int k = 0;
        int time = 0;
        int time1 = 0;
        while (p != -1) {
            p = str.indexOf('(', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        p = 0;
        while (p != -1) {
            p = str.indexOf(')', p);
            if (p != -1) {
                p++;
                k++;
            }
        }
        if (n == k) {
            here:
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(j) == ')') {
                            continue here;
                        }
                    }
                    break here;
                }
                if (str.charAt(i) != '(' && i == str.length() - 1) {
                    time++;
                }
            }
            here:
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == ')') {
                    for (int j = i - 1; j > 0; j--) {
                        if (str.charAt(j) == '(') {
                            continue here;
                        }
                    }
                    break here;
                }
                if (str.charAt(i) != ')' && i == 0) {
                    time1++;
                }
            }

        }
        if (time == time1 && time == 1) {
            System.out.println("Выражение валидно");
        } else {
            System.out.println("Выражение не валидно");
        }
        if (n != k) {
            System.out.println("Выражение не валидно");
        }
    }
}