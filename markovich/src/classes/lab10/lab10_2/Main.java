package classes.lab10.lab10_2;

import java.util.Arrays;

/**
 * Создайте итератор, который может проходить массив строк.
 */
public class Main {
    public static void main(String[] args) {

        String[] words = {"mather","father","son","daughter","sister","brother","grandfather","grandmother","uncle"};

        StringIterator stringIterator = new StringIterator(words);

        while (stringIterator.hasNext()) {
            String str = stringIterator.next();
            System.out.println(str);
        }
    }
}
