package workbook.lab30;

import java.io.FileWriter;

public class MyFileWriter {
    public static void recordTextInFile(String text, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath, false);
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
