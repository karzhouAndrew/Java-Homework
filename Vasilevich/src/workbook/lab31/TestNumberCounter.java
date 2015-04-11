package workbook.lab31;

import java.io.IOException;

/**
 * Created by vasilevich on 13.03.2015.
 * Имеется файл с текстом,в котором присутствуют числа. Найти все числа, распечатать их, посчитать сумму,
 * убрать повторяющиесячисла и вновь распечатать.
 */
public class TestNumberCounter {
    public static void main(String[] args) {
        NumberCounter numberCounter = new NumberCounter();
        try {
            numberCounter.FileLoader("Blob.txt");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        System.out.println(numberCounter);
    }
}
