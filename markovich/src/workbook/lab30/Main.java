package workbook.lab30;


/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */

public class Main {
    public static void main(String[] args) {
        String str = "В понедельник Apple проведет презентацию Apple Watch, первого полностью нового продукта с момента выпуска iPad в 2010 году.";
        FileOperations.writerFile(str);
        FileOperations.readerFile();
        Counter.countWordsAndPuncts();
    }
}