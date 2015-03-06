package workbook.lab29;

import java.util.HashMap;
import java.util.Map;

/**
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class Load {
    public static void main(String[] args) {
        String text = "Чтобы проверить, сколько раз в тексте встречается слово, нужно взять и проверить, сколько раз оно встречается. ";
        text=text.trim();
        text= text.toLowerCase();
        text=text.replaceAll("[,.]+", "");
        String[] words = text.split(" +");
        Map<String, Integer> wordsCountOfText = new HashMap<String, Integer>();
        for (String currentWord : words) {
            if (wordsCountOfText.get(currentWord) != null) {
                Integer counter = wordsCountOfText.get(currentWord) + 1;
                wordsCountOfText.put(currentWord, counter);
            } else {
                wordsCountOfText.put(currentWord, 1);
            }
        }
        System.out.println(wordsCountOfText);
    }
}
