// Task3.
// Создать простой логгер, выводящий сообщения об ошибках в текстовый файл. Объект логгера создать с помощью Singleton.
// У объекта должен быть метод, получающий текстовое сообщение об ошибке и записывающий его в файл вместе с датой и временем ошибки.
package workbook2.workbook2Tasks.task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = {0, 1, 2};
        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptionToLog(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        try {
            System.out.println(array[1] / array [0]);
        } catch (ArithmeticException e) {
            exceptionToLog(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public static void exceptionToLog(String exceptionMessage) throws IOException {
        Logger logger1 = Logger.getInstance();
        logger1.log(exceptionMessage);
    }
}
