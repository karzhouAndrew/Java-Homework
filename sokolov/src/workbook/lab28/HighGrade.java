package workbook.lab28;
/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.
 */
import workbook.lab26.ListGradesPupils;

public class HighGrade {
    public static void main(String[] args) {
        ListGradesPupils listGradesPupils = new ListGradesPupils();
        listGradesPupils.addPupils(4);
        listGradesPupils.showPupils();
        System.out.println(listGradesPupils.getHighGrade());
    }
}
