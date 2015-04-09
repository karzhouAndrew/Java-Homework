package workbook.test7_12;

import java.util.Set;

/**
 * Найти в файле с текстом числа, распечатать, найти сумму, убрать повторы, распечатать
 */
public class NumbersTest {
    public static void main(String[] args) {
        TextReader textReader = new TextReader();
        String str = textReader.textToString();
        NumbersFinder numbersFinder = new NumbersFinder();
        Set<Integer> numList = numbersFinder.finder(str);
        System.out.println(numList);
    }
}
