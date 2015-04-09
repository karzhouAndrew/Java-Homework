package workbook.blinov9;

/**
 * Created by Natashka on 02.03.2015.
 */
public class WordsSorting {
    public String[] sortingByLetterNum(String[] words, int[] letterNumber) {
        String[] alphabet = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "э", "ю", "я"};
        for (int i = words.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (letterNumber[j] > letterNumber[j + 1]) {
                    int temp = letterNumber[j + 1];
                    letterNumber[j + 1] = letterNumber[j];
                    letterNumber[j] = temp;
                    String tempWord = words[j + 1];
                    words[j + 1] = words[j];
                    words[j] = tempWord;
                }
            }
        }
        String[] sortedWords = new String[words.length];
        int counter = 0;
        for (int i = 0; i <= letterNumber[letterNumber.length - 1]; i++) {
            for (String letter : alphabet) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].startsWith(letter) && (letterNumber[j] == i)) {
                        sortedWords[counter]=words[j];
                        counter++;
                    }
                }
            }
        }
        return sortedWords;
    }
}
