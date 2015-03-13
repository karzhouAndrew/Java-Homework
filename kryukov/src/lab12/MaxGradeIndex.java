package lab12;

/*
Найти максимальную оценку полученную учениками класса и вывести ее номер.
 */
public class MaxGradeIndex {
    public static void main(String[] args) {
        int[] grades = {1, 2, 4, 8, 9, 5, 7, 3, 10};
        int MaxMark = grades[0];
        int MaxNum = 0;
        for (int i = 0; i < grades.length; i++) {
            if (MaxMark < grades[i]) {
                MaxMark = grades[i];
            }
        }
        System.out.println("максимальная оценка = " + MaxMark);
        for (int i = 0; grades[i] < MaxMark; i++) {
            MaxNum = i + 1;
        }
        System.out.println("индекс максимальной оценки = " + MaxNum);
    }
}
