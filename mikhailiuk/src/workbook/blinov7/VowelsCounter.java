package workbook.blinov7;

/**
 * Created by Natashka on 20.02.2015.
 */
public class VowelsCounter {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public int counter() {
        char[] vowels = {'а', 'е', 'ё', 'и', 'у', 'э', 'ю', 'я', 'о'};
        int n = 0;
        char vowel;
        for (int i = 0; i < str.length(); i++) {
            vowel = str.charAt(i);
            for (char vow : vowels) {
                if (vowel == vow) {
                    n++;
                }
            }
        }
        return n;
    }
}
