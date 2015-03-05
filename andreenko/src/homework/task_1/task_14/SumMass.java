package homework.task_1.task_14;

/**
 * Created by Администратор on 08.02.2015.
 * Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */
public class SumMass {
    public static void main(String[] args) {
        int m = 8;
        int marks[] = new int[m];
        for (int i = 0; i < m; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        int maxi;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == max) {
                maxi = i;
                System.out.println(maxi);
            }
        }
        int min = marks[0];
        int mini;
        for (int i = 0; i < marks.length; i++) {
            if (min > marks[i]) {
                min = marks[i];
            }
        }
        for (int j = 0; j < marks.length; j++) {
            if (marks[j] == min) {
                mini = j;
                System.out.println(mini);
            }
        }
        System.out.println();
        System.out.println("Максимальная оценка: " + max);
    }
}
