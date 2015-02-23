package workbook.task_3;

/**
 * Created by Алексей Андреенко on 05.02.2015.
 * Создайте число. Определите, является ли последняя цифра числа семеркой?
 */
public class If7 {
    public static void main(String[] args) {
        int x = 88835;
        if (x % 10 == 7) {
            System.out.println("7 является последней цифрой");
        } else {
            System.out.println("7 не является последней цифрой");
        }

    }
}