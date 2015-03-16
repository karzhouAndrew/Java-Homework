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
        int wordsInSentense[] = CalcWordSentenses();
        int orderedArr[] = new int[wordsInSentense.length];
        for (int ind = 0; ind < wordsInSentense.length; ind++) {
            orderedArr[ind] = ind;
        }

        for (int indSntns = 0; indSntns < wordsInSentense.length - 1; indSntns++) {
            int tmp;
            for (int indOrder = 0; indOrder < wordsInSentense.length - indSntns - 1; indOrder++) {

                if (wordsInSentense[indOrder] > wordsInSentense[indOrder + 1]) {

                    tmp = wordsInSentense[indOrder];
                    wordsInSentense[indOrder] = wordsInSentense[indOrder + 1];
                    wordsInSentense[indOrder + 1] = tmp;
                    tmp = orderedArr[indOrder];
                    orderedArr[indOrder] = orderedArr[indOrder + 1];
                    orderedArr[indOrder + 1] = tmp;
                }
            }
        }

        StringBuilder strResult = new StringBuilder();
        for (int ind = 0; ind < wordsInSentense.length; ind++) {
            strResult.append(wordManager.getSentense(orderedArr[ind]));
        }
        System.out.println(strResult.toString());
    }

    private static int[] CalcWordSentenses() {
        WordManager wordManager = new WordManager(strVal);
        int sentenceCount = wordManager.getSentenseCount();
        int wordCountArr[] = new int[sentenceCount];
        for (int ind = 0; ind < sentenceCount; ind++) {
            wordCountArr[ind] = wordManager.getNumWordsInSentense(ind);
        }

        return wordCountArr;
    }
}
