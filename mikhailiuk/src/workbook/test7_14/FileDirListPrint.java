package workbook.test7_14;

import java.io.File;

/**
 * Created by Natashka on 11.03.2015.
 */
public class FileDirListPrint {

    public void filesList(String[] list, String dir) {
        System.out.println("Файлы");
        for (String temp : list) {
            File file = new File(dir + "\\" + temp);
            if (!file.isDirectory()) {
                System.out.println(file);
            }
        }
    }

    public void dirList(String[] list, String dir) {

        System.out.println("Каталоги");
        for (String temp : list) {
            File file = new File(dir + "\\" + temp);
            if (file.isDirectory()) {
                System.out.println(file);
            }
        }
    }
}

