package workbook.lab26;

import java.util.Random;

/**
 * Created by vasilevich on 12.03.2015.
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка
 */
public class StedentMarkTester {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        int studentCount = 7;
        Random random = new Random();
        for (int studentInd = 0; studentInd < studentCount; studentInd++){
            int markCount = random.nextInt(15);
            int[] marks = new int[markCount];
            for (int markInd = 0; markInd < markCount; markInd++){
                marks[markInd] = random.nextInt(7) + 4;
            }
            studentList.addStudent(LastNameEnum.generateLastName(), marks);
        }
        System.out.println("Student list before correct");
        System.out.println(studentList);
        studentList.checkStudents();
        System.out.println("Student list after correct");
        System.out.println(studentList);
    }
}
