package workbook.test7_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Natashka on 10.03.2015.
 */
public class TextReader {
    public void reader() {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("text.txt"));
            StringBuilder builder = new StringBuilder();
            String str = "";
            while (str != null) {
                str = fileReader.readLine();
                builder.append(str);
            }
            PunctuationCounter counter = new PunctuationCounter();
            int count = 0;
            str = builder.toString();
            for (int i = 0; i < str.length(); i++) {
                count += counter.punctuationSearch(str.charAt(i));
            }
            System.out.println("Знаков препинания " + count);
            String[] words = str.split("\\s");
            System.out.println("Слов " + (words.length-1));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O error");
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Stream closing error");
                }
            }
        }
    }
}
