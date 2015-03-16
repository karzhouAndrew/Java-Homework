package workbook.lab39;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Имеется файл с текстом, в котором присутствуют числ. Найти все числа, распечатать, посчитать сумму, убрать все
 повторяющиеся числа и снова распечатать.
 */
public class task12 {
    public static void main(String[] args) throws IOException {
        File file = new File("welcom.txt");
        try {
            FileReader myText = new FileReader(file);
            int character = myText.read();
            StringBuilder builder = new StringBuilder();
            while (character != -1) {
                builder.append((char) character);
                character = myText.read();
            }
            myText.close();
            System.out.println("Исходный текст с цифрами: " + builder);
            String str = builder.toString();
            List<Integer> arrayWithMyText = new ArrayList<Integer>();
            List<Integer> arrayDigit = new ArrayList<Integer>();
            Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                arrayWithMyText.add(matcher.start());
            }
            char[] arrayLetter = str.toCharArray();
            for (int k : arrayWithMyText) {
                int digit = Character.getNumericValue(arrayLetter[k]);
                arrayDigit.add(digit);
            }
            System.out.println("Все цифры: " + arrayDigit);
            int sumDigit = 0;
            for (int j : arrayDigit) {
                sumDigit += j;
            }
            System.out.println("Сумма всех цифр = " + sumDigit);
            Set<Integer> differentDigit = new HashSet<Integer>(arrayDigit);
            System.out.println("Не повторяюшиеся цифры: " + differentDigit);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
