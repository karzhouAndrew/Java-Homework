package workbook.test7_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Natashka on 10.03.2015.
 */
public class TextReader {
    public String textToString() {
        BufferedReader reader = null;
        String str = "";
        StringBuilder builder = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("cocktail.txt"));
            while ((str = reader.readLine()) != null) {
                builder.append(str);
            }
         } catch (IOException e) {
            System.out.println("I/O error");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Stream closing error");
            }
        }
        return builder.toString();
    }
}
