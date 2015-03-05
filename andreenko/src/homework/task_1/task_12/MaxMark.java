package homework.task_1.task_12;

/**
 * Created by Администратор on 08.02.2015.
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */
public class MaxMark {
    public static void main(String[] args) {
        int m = 8;
        int marks[] = new int[m];
        for (int i = 0; i < m; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        int maxMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
            }
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == maxMark) {
                System.out.println("Оценка № " + (i + 1) + " является максимальной");
            }
        }
        System.out.println();
        System.out.println("Максимальная оценка: " + maxMark);
    }
}
