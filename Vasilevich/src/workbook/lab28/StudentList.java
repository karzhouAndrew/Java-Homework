package workbook.lab28;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasilevich on 12.03.2015.
 */
public class StudentList {
    private List<Student> studentArr = new ArrayList();

    public void addStudent(String lastName, int[] marks) {
        Student student = new Student();
        student.setLastName(lastName);
        student.addMarks(marks);
        studentArr.add(student);
    }

    public int findMaxMark() {
        int maxMark = Integer.MIN_VALUE;
        int mark;
        for (Student student : studentArr) {
            mark = student.findMaxMark();
            maxMark = (mark>maxMark)?mark:maxMark;
        }
        return maxMark;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "studentArr=" + studentArr +
                '}';
    }
}
