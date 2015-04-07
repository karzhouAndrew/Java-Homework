package workbook2.lab3;

/**
 * Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл.
 * Объект логгера должен быть создан с помощью ШП Singleton. У объекта должен быть обязательным один метод,
 * получающий на вход текст сообщения об ошибке и записывающий его в файл вместе с информацией о дате и времени проишествия.
 */
public class Logger {
    public static void main(String[] args) {
        try {
            int i = 0;
            System.out.println(10 / i);
        } catch (Exception e2) {
            Singleton singleton = Singleton.getInstance();
            singleton.getError(e2.getMessage());
        }
    }
}
