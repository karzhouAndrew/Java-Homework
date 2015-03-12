package workbook.test7_11;

import java.io.*;

/**
 * Created by Natashka on 10.03.2015.
 */
public class TextWriter {
    public void writer() {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new BufferedWriter(new FileWriter("text.txt"));
            System.out.println("Введите текст, нажмите ввод. По окончании нажмите 0 и ввод");
            String str = "";
            do {
                str = reader.readLine();
                if (!str.equals("0")) {
                    writer.write(str + " ");
                }
            } while (!str.equals("0"));
        } catch (IOException e) {
            System.out.println("I/O error");
        } finally {
            if (writer != null && reader != null) {
                try {
                    writer.close();
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Stream closing error");
                }
            }
        }
    }
}
