package classes.test_file_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Natashka on 11.03.2015.
 */
public class TestFileReader {
    public String textToString() {
        BufferedReader reader = null;
        String str = "";
        StringBuilder builder = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("testfile.txt"));
            while ((str = reader.readLine()) != null) {
                builder.append(str).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return builder.toString();
    }
}
