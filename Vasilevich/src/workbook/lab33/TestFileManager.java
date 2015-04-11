package workbook.lab33;

/**
 * Created by vasilevich on 13.03.2015.
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и катаолги должны быть распечатаны отдельно
 */
public class TestFileManager {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.fileAnalize("F:\\Java-Homework\\Vasilevich\\");
    }
}
