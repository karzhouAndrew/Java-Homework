package classes.test_file_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Natashka on 11.03.2015.
 */
public class StudentsListWriter {
    public void writer(String str) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("students.txt"));
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
