package workbook.lab32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Записать в двоичный файл 20 случайных чисел. Прочитать записан-ный файл,
 * распечатать числа и их среднее арифметическое.
 */
public class Load {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("File_task32.bin");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            fileOutputStream.write((int) (Math.random() * 50));
        }
        fileOutputStream.close();

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("File_task32.bin");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        Integer res = fileInputStream.read();
        int count = 0;
        double summ = 0;
        System.out.print("Считал бинарный файл с числами:");
        while (res != -1) {
            count++;
            System.out.print(" " + res);
            summ=summ+res;
            res = fileInputStream.read();
        }
        System.out.println("\nСреднее арефметическое: "+summ/count);
        fileInputStream.close();
    }
}
