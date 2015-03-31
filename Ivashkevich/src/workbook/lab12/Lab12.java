package workbook.lab12;

/*
 * Найти максимальное значение в массиве и вывести его индекс.
 */
public class Lab12 {
    public static void main(String[] args) {
        int maxNumber = 0;
        int maxIndex = 0;
        int i;
        int marks[] = new int[10];
        int index[] = new int[marks.length];
        System.out.println("\nВ данном массиве случайных чисел\n");
        for (i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            if (marks[i] >= maxNumber) {
                maxNumber = marks[i];
                maxIndex = i;
                index[i]=maxNumber;
            }
            System.out.print(marks[i] + " ");


        }
        System.out.println();
        System.out.print("\nМаксимальное значение под индексом: ");
        for (i = 0; i < marks.length; i++) {
            if (index[maxIndex] == index[i])
                if (i == maxIndex) {
                    break;
                } else {
                    System.out.print(i + ", ");
                }
        }
        System.out.print(maxIndex);
    }

}
