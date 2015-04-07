package workbook.lab33;

import java.io.File;

/**
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */
public class Load {
    public static void main(String[] args) {
        File file;
        file = new File("c:\\work\\Intellij\\Java-Homework\\");
        File[] listPath = file.listFiles();
        System.out.println("File");

        assert listPath != null;
        for (File path : listPath) {
            if (path.isFile()) {
                System.out.println(path);
            }
        }
        System.out.println("\nPath");
        for (File path : listPath) {
            if (path.isDirectory()) {
                System.out.println(path);
            }
        }
    }
}

