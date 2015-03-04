package workbook.lab28;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MarkOperations {

    public static int maxMark(List<Student> studentList) {
        ListIterator<Student> listIterator = studentList.listIterator();
        int maxMark = 0;
        while (listIterator.hasNext()) {
            if (listIterator.next().getMark() > maxMark) {
                maxMark = listIterator.previous().getMark();
            }
        }
        return maxMark;
    }

    public static List<Student> bestStudents(int maxMark, List<Student> studentList) {
        List<Student> bestStudentList = new ArrayList<Student>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMark() == maxMark) {
                bestStudentList.add(studentList.get(i));
            }
        }
        return bestStudentList;
    }
}
