package workbook.labmath2;

/**
 * Created by Natashka on 16.02.2015.
 */
public class VowelsCounter {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public int vowelsCounter() {
        int vowels = 0;
        str = str.trim();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'у' || str.charAt(i) == 'е' || str.charAt(i) == 'ы' || str.charAt(i) == 'а' ||
                    str.charAt(i) == 'о' || str.charAt(i) == 'э' || str.charAt(i) == 'я' || str.charAt(i) == 'и' || str.charAt(i) == 'ю' || str.charAt(i) == 'ё') {
                vowels++;
            }
        }
        return vowels;
    }
}
