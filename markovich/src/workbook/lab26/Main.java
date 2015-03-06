package workbook.lab26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка
 */

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        int quantityStudents = 7;
        List<Student> students = ListOperations.fillingList(quantityStudents);
        System.out.println(students);

        System.out.println(ListOperations.deleteBadStudents(students));
    }
}
