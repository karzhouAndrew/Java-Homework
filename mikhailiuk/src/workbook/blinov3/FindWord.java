package workbook.blinov3;

/**
 * Created by Natashka on 19.02.2015.
 */
public class FindWord {

    public void word(String str) {
        String[] sentence = str.split("[.\\x3f!]");
        String firstSent = sentence[0];
        sentence[0]="";
        String[] words = firstSent.split("\\s");
        String otherSent = sentence[1]+""+sentence[2];
        System.out.println(otherSent);
        for (int i = 0; i < sentence.length; i++) {
            if (otherSent.lastIndexOf(words[i]) == -1) {
                System.out.println("Слово, которого нет в других предложениях " + words[i]);
            }
        }
    }
}
