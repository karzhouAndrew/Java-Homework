package workbook.lab26;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */
public class AssessmentsList {
    public static void main(String[] args) {
        ListGradesPupils listGradesPupils = new ListGradesPupils();
        listGradesPupils.addPupils(4);
        listGradesPupils.showPupils();
        listGradesPupils.deleteUnsatisfactoryMark();
        listGradesPupils.showPupils();
    }
}
