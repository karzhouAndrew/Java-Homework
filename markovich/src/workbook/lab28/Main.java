package workbook.lab28;

import java.util.List;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 */

public class Main {
    public static void main(String[] args) {

        int quantityStudents = 7;
        List<Student> studentList = ListOperations.fillingList(quantityStudents);

        System.out.println(studentList);

        System.out.println(MarkOperations.bestStudents(MarkOperations.maxMark(studentList), studentList));
    }
}
