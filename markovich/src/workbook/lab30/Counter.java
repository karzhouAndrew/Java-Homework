package workbook.lab30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Counter {
    public static void CountWordsAndPuncts() {
        try {
            Scanner scanner = new Scanner(new File("markovich/src/workbook/lab30/filename.txt")).useDelimiter("\\Z");
            String text = scanner.next();
            scanner.close();

            System.out.println("Слов: " + String.valueOf(text.split("[ \t\n]+").length));
            System.out.println("Знаков пунктуации: " + String.valueOf(text.replaceAll("\\P{Punct}", "").length()));
        } catch (FileNotFoundException e) {
            System.err.println("Can't find input file!");
        } catch (NoSuchElementException e) {
            System.err.println("Can't read from input file!");
        }
    }
}
