package homework.work3;

/*Имеется последовательность случайных чисел, найти и вывести наибольшее из них*/

public class Task9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 30, 4, 5, 6, 7, 8, 9};
        int maxElem = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (maxElem < array1[i]) {
                maxElem = array1[i];
            }
        }
        System.out.println("Максимальный элемент: " + maxElem);

    }
}
