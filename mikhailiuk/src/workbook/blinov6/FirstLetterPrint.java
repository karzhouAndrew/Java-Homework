package workbook.blinov6;

/**
 * Created by Natashka on 20.02.2015.
 */
public class FirstLetterPrint {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void firstLetterPrint() {
        str = str.toLowerCase();
        String[] alphabet = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "э", "ю", "я"};
        String[] words = str.split("[[\\s]+]|[[.,\\x3f!]\\s+]");
        for (String letter : alphabet) {
            int label = 0;
            for (String word : words) {
                if (word.startsWith(letter)) {
                    System.out.print(word + " ");
                    label++;
                }
            }
            if (label > 0) {
                System.out.println();
            }
        }
    }
}
