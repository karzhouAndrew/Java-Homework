package workbook.lab26;

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

    public void checkStudents() {
        for (Student student : studentArr) {
            student.checkMarks();
        }
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "studentArr=" + studentArr +
                '}';
    }
}
