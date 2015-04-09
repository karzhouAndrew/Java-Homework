package workbook.blinov9;

/**
 * Created by Natashka on 02.03.2015.
 */
public class LetterCounter {
    public int[] counter(String[] words, char letter) {
        int[] letterNumber = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                if (words[i].charAt(j) == letter) {
                    letterNumber[i]++;
                }
            }
        }
        return letterNumber;
    }
}



