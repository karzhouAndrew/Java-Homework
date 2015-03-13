package classwork.workWithFile.task6;

import java.io.File;
import java.io.IOException;

/**
 * Created by Leonid on 13.03.2015.
 */
public class MakeFile {
    public static final String FILE_PATH = "c:\\work\\Intellij\\Java-Homework\\dataType\\Test.txt";

    public static void make() throws IOException {
        File fileDirect = new File("c:\\work\\Intellij\\Java-Homework\\dataType\\");
        if (fileDirect.mkdirs()) {
            File file = new File(FILE_PATH);
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
