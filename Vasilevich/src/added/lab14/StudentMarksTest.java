package added.lab14;

import java.io.IOException;
import java.util.Random;

/**
 * Created by Sam on 11.03.2015.
 * В файле содержатся фамилии студентов и их оценки, записать порписными буквами фамилии тех студентов, которые имеют
 * средний бал более 7
 */
public class StudentMarksTest {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // Код для генерации рандомного файла со студентами закоментарен
        /*int studentCount = 10;
        Random random = new Random();
        int marksCount;
        for (int i = 0; i < studentCount; i++){
            int[] marksArr = new int[random.nextInt(5) + 5];
            for (int markInd = 0; markInd < marksArr.length; markInd++){
                marksArr[markInd] = random.nextInt(11);
            }
            studentList.addStudentToList(LastNameEnum.generateLastName().toLowerCase(), marksArr);
        }

        try {
            studentList.saveStudentsToFile("students.txt");

        }catch (IOException e){
            System.out.println(e.toString());
        }*/

        try {
            studentList.readFromFile("E:\\Java\\Homework\\Java-Homework\\Vasilevich\\src\\added\\lab14\\students.txt");
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        studentList.checkStudents();
        try {
            studentList.saveStudentsToFile("E:\\Java\\Homework\\Java-Homework\\Vasilevich\\src\\added\\lab14\\students1txt");

        } catch (IOException e) {
            System.out.println(e.toString());

        }
    }
}
