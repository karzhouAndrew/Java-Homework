package workbook.lab26;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка
 */

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<Student> students = new ArrayList<Student>();
        int quantityStudents = 7;
        for (int i = 0; i < quantityStudents; i++) {
            students.add(new Student());
        }
        System.out.println(students);

        ListIterator<Student> listIterator = students.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().getMark() < 4) {
                listIterator.remove();
            }
        }
        System.out.println(students);
    }
}
