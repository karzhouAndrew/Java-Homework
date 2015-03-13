package lab14;

/*
Определить сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */
public class SumBetweenMinMax {
    public static void main(String[] args) {

        //int[] array = new int[8];
        int[] array = {3, 9, 2, 3, 1, 6, 7, 5, 4};
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("минимальное значение = " + min);
        System.out.println("максимальное значение = " + max);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                i++;
                for (; array[i] < max; i++)
                    sum += array[i];
            } else if (array[i] == max) {
                i++;
                for (; array[i] > min; i++)
                    sum += array[i];
            }
        }
        System.out.println("сумма элементов массива между минимальным и максимальным значениями = " + sum);
    }
}
