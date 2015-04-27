package workbook.lab30;

import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static String readFile(String filePath) {
        String str2 = "";
        try {
            FileReader reader = new FileReader(filePath);
            int c;
            while ((c = reader.read()) != -1) {
                str2 = str2 + (char) c;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str2;
    }
}
