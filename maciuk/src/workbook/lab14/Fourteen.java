package workbook.lab14;

/**
 * Created by Asus on 21.02.2015.
 */
public class Fourteen {
    public static void main(String[] args) {
        int array[] = {3, 9, 10, 3, 7, 9, 4, 5, 0, 1};
        int min = array[0];
        int max = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }
        first: for (int k = 0; k < array.length; k++) {
            if (min == array[k] || max == array[k]) {
                for (int i = k + 1; min < array[i] && array[i] < max && i <array.length; i++) {
                    sum += 1;
                }
                break first;
            }
        }
        System.out.println("Сумма элементов между минимальным и максимальным значениями элементов = " + sum);
    }
}
