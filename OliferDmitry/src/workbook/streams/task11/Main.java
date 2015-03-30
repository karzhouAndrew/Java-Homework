// Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
package workbook.streams.task11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        int words = 0;
        int puncts = 0;
        String line = br.readLine();
        while (line != null) {
            words += countWords(line);
            puncts += countPuncts(line);
            line = br.readLine();
        }

        System.out.println("Total words: " + words);
        System.out.println("Total puncts: " + puncts);
        br.close();
    }

    public static int countWords(String line) {
        int count = 0;
        String[] splitted = line.split("[\\p{Punct}| +|0-9]");
        for (String word : splitted) {
            if (word.length() > 0) {
                count++;
            }
        }
        return count;
    }

    private static int countPuncts(String line) {
        int count = 0;
        Matcher match = Pattern.compile("\\p{Punct}").matcher(line);
        while (match.find()) {
            count++;
        }
        return count;
    }
}
