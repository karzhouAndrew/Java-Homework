// Из текстового файла ввести последовательность строк. Выделить слова, разделяемые пробелами.
// Написать метод поиска слова по образцу. Вывести найденное слово в другой файл.
package workbook.classwork.files.task11;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "text.txt";
        System.out.println("Input word which u need to find: ");
        String word = new Scanner(System.in).nextLine();
        File oldFile = new File(fileName);
        File newFile = new File("new_" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(oldFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        String line;

        while ((line = br.readLine()) != null) {
            String wordIsFound = findThisWord(line, word);
            if (wordIsFound.length() != 0) {
                bw.write(wordIsFound);
            }
        }

        br.close();
        bw.close();
    }

    private static String findThisWord(String line, String word) {
        String result = "";
        String[] splitted = line.trim().split(" +");
        for (String each : splitted) {
            if (each.equalsIgnoreCase(word)) {
                result += (each + "\r\n");
            }
        }
        return result;
    }
}
