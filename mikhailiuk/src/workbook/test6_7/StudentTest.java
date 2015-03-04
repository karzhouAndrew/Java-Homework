package workbook.test6_7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * Создать список оценок (учеников), заполнить случайными оценками (учениками), удалить неудовлетворительные оценки (учеников).
 */
public class StudentTest {
    public static void main(String[] args) {
        int maxMark = 11;
        int badMark = 3;
        List<Student> studentList = new ArrayList<Student>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            String[] names = student.getNames();
            student.setName(names[random.nextInt(names.length)]);
            String[] surNames = student.getSurnames();
            student.setSurname(surNames[random.nextInt(names.length)]);
            student.setMark(random.nextInt(maxMark));
            studentList.add(student);
        }
        System.out.println(studentList);
        ListIterator<Student> iterator = studentList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getMark() <= badMark) {
                iterator.remove();
            }
        }
        System.out.println(studentList);
    }
}
