package homework.work8.Task7;

import java.util.ArrayList;
import java.util.List;


/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */
public class main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int countStudent = 30;
        for (int i = 0; i < countStudent; i++) {
            int value = (int) (Math.random() * 10);
            arrayList.add(value);
        }
        int size = arrayList.size();

        for (int i = 0; i < size - 1; i++) {
            if (arrayList.get(i) <= 3) {
                arrayList.remove(i);
                size = arrayList.size();
                continue;
            }
            System.out.println(arrayList.get(i));
        }

    }

}
