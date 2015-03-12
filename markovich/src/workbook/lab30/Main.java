package workbook.lab30;


/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */

public class Main {
    public static void main(String[] args) {
        FileOperations.writerFile();
        FileOperations.readerFile();
        Counter.CountWordsAndPuncts();
    }
}