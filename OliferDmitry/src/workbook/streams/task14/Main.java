package workbook.streams.task14;
// Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File path = new File("c:/");
        File[] filesAndFolders = path.listFiles();

        System.out.println("-= Folders =-");
        for (File fileOrFolder : filesAndFolders) {
            if (fileOrFolder.isDirectory()) {
                System.out.println(fileOrFolder);
            }
        }
        System.out.println("\n-= Files =-");
        for (File fileOrFolder : filesAndFolders) {
            if (fileOrFolder.isFile()) {
                System.out.println(fileOrFolder);
            }
        }
    }
}
