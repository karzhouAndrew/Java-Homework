package workbook.lab30;

import java.io.IOException;

/**
 * Created by vasilevich on 13.03.2015.
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов
 */
public class TestPunkMarkCounter {
    public static void main(String[] args) {
        WordAndMarkCounter wordAndMarkCounter = new WordAndMarkCounter();
        try {
            wordAndMarkCounter.FileLoader("Blob.txt");
        }catch (IOException e) {
            System.out.println(e.toString());
        }
        System.out.println(wordAndMarkCounter.toString());
    }
}
