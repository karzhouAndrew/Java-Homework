package workbook.lab28;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 */

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        int quantityStudents = 8;
        for (int i = 0; i < quantityStudents; i++) {
            studentList.add(new Student());
        }
        System.out.println(studentList);
        System.out.println(MarkOperations.bestStudents(MarkOperations.maxMark(studentList), studentList));
    }
}
