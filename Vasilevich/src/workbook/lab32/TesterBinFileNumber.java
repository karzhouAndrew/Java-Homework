package workbook.lab32;

import java.io.IOException;

/**
 * Created by vasilevich on 13.03.2015.
 * Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и  их среднее арифметическое
 */
public class TesterBinFileNumber {
    public static void main(String[] args) {
        BinFileNumber binFileNumber = new BinFileNumber();
        try {
            String fileName = "Blob.txt";
            binFileNumber.saveToFile(fileName);
            binFileNumber.fileLoader(fileName);
        }catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
