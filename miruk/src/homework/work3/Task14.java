package homework.work3;

/*сумма элементов одномерного массива между миним и максим элементами*/

public class Task14 {
    public static void main(String[] args) {
        int array[] = new int[20];
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + ", ");
        }
        int max = array[0], min = array[0];
        System.out.println("  ");
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        int sum = 0;
        if (minIndex < maxIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                sum += array[i];
            }
        } else {
            for (int i = maxIndex; i <= minIndex; i++) {
                sum += array[i];
            }
        }
        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("Сумма между минимальным и максимальным значениями элементов массива равна: " + sum);

    }
}
