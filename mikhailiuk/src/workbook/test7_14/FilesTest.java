package workbook.test7_14;

import java.io.File;

/**
 * Created by Natashka on 11.03.2015.
 */
public class FilesTest {
    public static void main(String[] args) {
        String dir = "C:\\";
        File root = new File(dir);
        if (root.isDirectory()) {
            System.out.println("Каталог " + dir);
            String[] list = root.list();
            FileDirListPrint fileDirListPrint = new FileDirListPrint();
            fileDirListPrint.dirList(list, dir);
            fileDirListPrint.filesList(list, dir);
        } else {
            System.out.println(dir + " не каталог");
        }
    }
}