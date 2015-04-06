package classwork.class6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Файл содержит символы, слова, целые числа и числа с плавающей запятой.
 * Определите все данные, тип которых вводится с командной строки.
 */
public class Task6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите тип выбираемых данных: 1-String, 2-Integer, 3-Double");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc = new Scanner(new FileReader("file.txt"));
        FileWriter pw = new FileWriter(new File("file_copy.txt"));
        String[] word;
        while (sc.hasNext()) {
            word = sc.next().split("\\s+");
            if (number == 2) {
            //  if (word instanceof(Integer))
            }
        }
        sc.close();
        pw.close();
    }
}
