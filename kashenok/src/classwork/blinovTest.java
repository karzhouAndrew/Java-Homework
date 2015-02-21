package classwork;

import classwork.Splitting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Рома on 18.02.2015.
 */
public class blinovTest {
    public static void main(String[] args) {

        String text = "The keyword public that element (a class, a method, a variable) can be accessed from any other Java. The keyword  this element (a class, a method, or a variable) can be accessed from any other. The keyword public means that this element (a class, a method, or a variable) can be accessed from any.The keyword protected makes the element visible not only from class, but from its subclasses too.";

        System.out.println(text);

        String[] sentence = text.split("[.]");
        int j = 0;
        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = sentence[i].trim();
            System.out.println("sentens[" + i + "]   " + sentence[i]);
            j = i;
        }
        System.out.println("Количество предложений в тексе: " + (j + 1));

        long[] temp = new long[10000];
        for (int k = 0; k <= j; k++) { //перебираем предложения
            String [] words = sentence[k].split("[\"()[' '+],-]+");
            System.out.println("words.length = " + words.length);
            temp[k] = words.length;
        }


        StringBuilder updateText = new StringBuilder();

        for (int i = 0; i < sentence.length; i++) {
            int minIndex = i;

            for (int k = i + 1; k < sentence.length; k++) {
                if (temp[k] < temp[minIndex]) {
                    minIndex = k;
                }
            }
            String temporary = sentence[i];
            int temporaryint = (int) temp[i];
            sentence[i] = sentence[minIndex];
            temp[i] = temp[minIndex];
            sentence[minIndex] = temporary;
            temp[minIndex] = temporaryint;
        }


        for (int i = 0; i < sentence.length; i++) {
            System.out.println(sentence[i]);
            updateText = updateText.append(sentence[i] + ". ");

        }
        System.out.println();
        System.out.println("updateText = " + updateText.toString());
    }
}


