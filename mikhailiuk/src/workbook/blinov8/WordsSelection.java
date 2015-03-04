package workbook.blinov8;

/**
 * Created by Natashka on 02.03.2015.
 */
public class WordsSelection {
    public String[] selector(String [] words, int wordsNum){
        char[] vowels = {'а', 'е', 'ё', 'и', 'у', 'э', 'ю', 'я', 'о'};
        String[] wordsStartsVowels = new String[wordsNum];
        char[] lettersNumber;
        int i=0;
        for (String word : words) {
            for (char vowel : vowels) {
                lettersNumber = word.toCharArray();
                 if (((lettersNumber.length > 1) && (word.charAt(0) == vowel) && (word.charAt(1) != vowel)) | ((lettersNumber.length > 2) && (word.charAt(0) == vowel) && (word.charAt(1) == vowel))) {
                   wordsStartsVowels [i]=word;
                     i++;
                }
            }
        }
        return wordsStartsVowels;
    }
}
