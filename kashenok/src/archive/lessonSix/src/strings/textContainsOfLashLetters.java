package strings;

/**
 * Created by Рома on 16.02.2015.
 */
public class textContainsOfLashLetters {
    public static void main(String[] args) {


        String str = " Проверочная  v бб  строка для вычисления  количества слов в  строке   шщор щщрпш щшргщр зззотшщ    ";
        String string = str.trim();

        char[] text = string.toCharArray();
        String punkt = ",.:;&!- ";
        char[] punktArray = punkt.toCharArray();

        char lastLetter;

        for (int i = 1; i < text.length; i++) {
            lastLetter = text[i];
            if (lastLetter == text[i - 1]) {
            } else {
                for (int j = 0; j < punktArray.length; j++) {
                    if (punktArray[j] == lastLetter) {
                        lastLetter = text[i - 1];
                        System.out.print(lastLetter);
                    }
                }
            }
        }

    }
}
