package workbook.lab28;

import java.util.Random;

/**
 * Created by vasilevich on 12.03.2015.
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора
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
        System.out.println(studentList);
        int maxMark = studentList.findMaxMark();
        System.out.println("Max mark = " + maxMark);
    }
}
