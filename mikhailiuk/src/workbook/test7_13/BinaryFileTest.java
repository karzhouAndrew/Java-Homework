package workbook.test7_13;

/**
 Записать в двоичный файл 20 случайных чисел, прочитать распечатать найти среднее арифметическое
 */
public class BinaryFileTest {
    public static void main(String[] args) {
        BinaryFileWrite binaryFileWrite=new BinaryFileWrite();
        binaryFileWrite.randomWrite();
        BinaryFileRead binaryFileRead=new BinaryFileRead();
        binaryFileRead.binaryRead();
    }
}
