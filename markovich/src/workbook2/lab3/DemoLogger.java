package workbook2.lab3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл. Объект логгера должен быть создан
 * с помощью ШП Singleton. У объекта должен быть обязательным один метод, получающий на вход текст сообщения об
 * ошибке и записывающий его в файл вместе с информацией о дате и времени проишествия.
 */

public class DemoLogger {
    private static String PATH_FILE = "markovich/src/workbook2/lab3/log.txt";

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance();
        System.out.print("Enter the number - ");
        Scanner in = new Scanner(System.in);
        try {
            int num = in.nextInt();
        } catch (InputMismatchException e) {
            logger.createLog(e.toString(),PATH_FILE);
        } finally {
            in.close();
        }
    }
}
