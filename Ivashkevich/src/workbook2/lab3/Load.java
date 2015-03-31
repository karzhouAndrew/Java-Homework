package workbook2.lab3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл.
 * Объект логгера должен быть создан с помощью ШП Singleton. У объекта должен быть
 * обязательным один метод, получающий на вход текст сообщения об ошибке и
 * записывающий его в файл вместе с информацией о дате и времени проишествия.
 */
public class Load {
    public static void main(String[] args) throws IOException {

        String message = "Start program";
        Logger.inLog(message);
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();
        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            Logger.inLog(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
