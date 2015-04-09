package workbook.blinov7;

/**
 * Created by Natashka on 20.02.2015.
 */
public class VowelsSorting {

    public void vowelsSorting(String str) {
        String str1 = str.replaceAll("[.\\x3f!]", "");
        String[] words = str1.split("\\s");
        int[] numOfVowels = new int[words.length];
        VowelsCounter vowelsCounter = new VowelsCounter();
        for (int i = 0; i < words.length; i++) {
            numOfVowels[i] = vowelsCounter.counter(words[i]);
        }
        for (int i = numOfVowels.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numOfVowels[j] > numOfVowels[j + 1]) {
                    int temp = numOfVowels[j];
                    numOfVowels[j] = numOfVowels[j + 1];
                    numOfVowels[j + 1] = temp;
                    String tempWord = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tempWord;
                }
            }
        }
        for (String temp : words) {
            System.out.println(temp);
        }
    }
}
