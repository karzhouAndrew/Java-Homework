package workbook.lab17;

/**
 * Created by Asus on 21.02.2015.
 */
public class Seventeen {
    public static void main(String[] args) {
        String str = " имя нельзя начинать с цифры, и не желательно со знака подчеркивания ";
        int word = 0;
        int p = 0;
        char c = ' ';
        while (p != -1) {
            p = str.indexOf(' ', p);
            if (p != -1) {
                if (p > 0 && c != str.charAt(p - 1)) {
                    word++;
                    p++;
                }
                p++;
            }
        }
        int t = str.length() - 1;
        if (c != str.charAt(t)) {
            word++;
        }
        System.out.print("Количество слов = " + word);
    }
}
