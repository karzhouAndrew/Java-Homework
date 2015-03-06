package workbook.lab26;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListOperations {

    public static List<Student> fillingList(int quantity) {
        Random random = new Random();
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < quantity; i++) {
            students.add(new Student());
        }
        return students;
    }

    public static List<Student> deleteBadStudents(List<Student> students) {
        ListIterator<Student> listIterator = students.listIterator();
        while (listIterator.hasNext()) {
            Student currentStudent = listIterator.next();
            if (currentStudent.getMark() < 4) {
                listIterator.remove();
            }
        }
        return students;
    }

}
