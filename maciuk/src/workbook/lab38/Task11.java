package workbook.lab38;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */
public class Task11 {
    public static void main(String[] args) {
        try {
            FileReader myFile = new FileReader("C://Users//Asus//Desktop//myText.txt");
            int i = myFile.read();
            StringBuilder builder = new StringBuilder();
            while (i != -1) {
                builder.append((char) i);
                i = myFile.read();
            }
            myFile.close();
            System.out.println("Мой текст: " + builder);
            Pattern pattern = Pattern.compile("\\p{Punct}");
            Matcher matcher = pattern.matcher(builder);
            int quantityPunctuation = 0;
            while (matcher.find()) {
                quantityPunctuation++;
            }
            System.out.println("Количество знаков препинания : " + quantityPunctuation);
            String[] myText1 = builder.toString().split(" +");
            int quantityWords = 0;
            for (int j = 0; j < myText1.length; j++) {
                quantityWords++;
            }
            System.out.println("Количество слов в файле = " + quantityWords);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
