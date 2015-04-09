package workbook.blinov2;

/**
 * Created by Natashka on 19.02.2015.
 */
public class WordsNumber {

    public void wordsNumber(String str) {
        String[] sentence = str.split("[.\\x3f!]");
        int[] numOfSent = new int[sentence.length];
        for (int i = 0; i < numOfSent.length; i++) {
            String sent = sentence[i];
            String[] words = sent.split("\\s");
            numOfSent[i] = words.length;
        }
        for (int i = numOfSent.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numOfSent[j] > numOfSent[j + 1]) {
                    int temp = numOfSent[j];
                    numOfSent[j] = numOfSent[j + 1];
                    numOfSent[j + 1] = temp;
                    String tempSent = sentence[j];
                    sentence[j] = sentence[j + 1];
                    sentence[j + 1] = tempSent;
                }
            }
        }
        for (String temp : sentence) {
            System.out.println(temp);
        }
    }
}

