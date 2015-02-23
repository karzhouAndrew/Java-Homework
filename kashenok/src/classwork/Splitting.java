package classwork;

public class Splitting {

    public static String[] splitSentence(String text) {
        String[] sentence = text.split("[.]");
        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = sentence[i].trim();
            System.out.println("sentens[" + i + "]   " + sentence[i]);
        }
        return sentence;
    }


    public static String[] splitWords(String sentence) {
        String[] words = sentence.split("[\"()[' '+],-]+");   // разрезаем предложение на слова
        return words;
    }


}
