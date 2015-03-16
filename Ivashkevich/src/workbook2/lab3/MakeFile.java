package workbook2.lab3;

import java.io.File;
import java.io.IOException;

/**
 * Created by Leonid on 13.03.2015.
 */
public class MakeFile {
    public static final String FILE_PATH = "./Log_file.txt";

    public static String make() throws IOException {
        File fileDirect = new File("./");
        try {
            fileDirect.mkdirs();
            File file = new File(FILE_PATH);
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("File not created");
        }
        return FILE_PATH;
    }
}

