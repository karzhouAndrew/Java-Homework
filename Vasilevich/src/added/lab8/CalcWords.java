package added.lab8;

/**
 * Created by Sam on 21.02.2015.
 * Задача от Блинова №2
 * Вывести все предложения заданного текста, в которых есть одинаковые слова
 */
public class CalcWords {
    private static String strVal = "1 Converts all of the characters. 2 In this String to lower case using the. 3 Rules of the given. 4 Case mapping.";


    private WordManager wordManager;

    public static void main(String[] args) {
        orderSentences();
    }

    private static void orderSentences() {
        WordManager wordManager = new WordManager(strVal);
        int wordsInSentense[] = calcWordSentenses();
        int orderedArr[] = new int[wordsInSentense.length];
        for (int i = 0; i < wordsInSentense.length; i++) {
            orderedArr[i] = i;
        }

        for (int indSntns = 0; indSntns < wordsInSentense.length - 1; indSntns++) {
            for (int indOrder = 0; indOrder < wordsInSentense.length - indSntns - 1; indOrder++) {
                if (wordsInSentense[indOrder] > wordsInSentense[indOrder + 1]) {
                    int tmp = wordsInSentense[indOrder];
                    wordsInSentense[indOrder] = wordsInSentense[indOrder + 1];
                    wordsInSentense[indOrder + 1] = tmp;
                    tmp = orderedArr[indOrder];
                    orderedArr[indOrder] = orderedArr[indOrder + 1];
                    orderedArr[indOrder + 1] = tmp;
                }
            }
        }

        StringBuilder strResult = new StringBuilder();
        for (int i = 0; i < wordsInSentense.length; i++) {
            strResult.append(wordManager.getSentense(orderedArr[i]));
        }
        System.out.println(strResult.toString());
    }

    private static int[] calcWordSentenses() {
        WordManager wordManager = new WordManager(strVal);
        int sentenceCount = wordManager.getSentenseCount();
        int wordCountArr[] = new int[sentenceCount];
        for (int i = 0; i < sentenceCount; i++) {
            wordCountArr[i] = wordManager.getNumWordsInSentense(i);
        }

        return wordCountArr;
    }
}
