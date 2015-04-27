package workbook.lab32;

/**
 * Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
public class TestReadWriteToFileNumbers {
    public static void main(String[] args) {
        String filePath = "F:/JAVA/Home_Work/Projectes/sokolov/src/workbook/lab32/text.txt";
        FileManager fileManager = new FileManager();
        int number = 4;
        String string = fileManager.generateStringOfNumbers(number);
        fileManager.recordToBinaryFile(filePath, string);
        String readFromFile = fileManager.readBinaryFile(filePath);
        System.out.println(readFromFile);

        int[] numbers = fileManager.parseToIntArray(readFromFile, number);
        System.out.println(fileManager.arithmeticMean(numbers));
    }
}
