package workbook.lab18;

/**
 * Created by Natashka on 16.02.2015.
 */
public class LastLetterWord {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void lastLetter() {
        str = str.trim();
        str = str + ' ';
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (str.charAt(i - 1) != ' ') {
                    if ((str.charAt(i - 1) != '.') && (str.charAt(i - 1) != ',')
                            && (str.charAt(i - 1) != '!') && (str.charAt(i - 1) != '?')) {
                        System.out.print(str.charAt(i - 1));
                    } else {
                        System.out.print(str.charAt(i - 2));
                    }
                }
            }
        }
    }
}
