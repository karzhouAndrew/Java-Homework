package workbook.blinov8;

/**
 * Created by Natashka on 02.03.2015.
 */
public class WordsCounter {

    public int counter(String[] words) {
        char[] vowels = {'а', 'е', 'ё', 'и', 'у', 'э', 'ю', 'я', 'о'};
        int wordsCounter = 0;
        char[] lettersNumber;
        for (String word : words) {
            for (char vowel : vowels) {
                lettersNumber = word.toCharArray();
                if (((lettersNumber.length > 1) && (word.charAt(0) == vowel) && (word.charAt(1) != vowel)) | ((lettersNumber.length > 2) && (word.charAt(0) == vowel) && (word.charAt(1) == vowel))) {
                    wordsCounter++;
                }
            }
        }
        return wordsCounter;
    }
}
