package workbook.lab14;

/*
 * Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */
public class Lab14 {
    public static void main(String[] args) {
        int numberArray[] = new int[15];
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < numberArray.length; i++) {
            int maxNumberIndex = i;
            for (int j = i; j < numberArray.length; j++) {
                if (numberArray[maxNumberIndex] < numberArray[j]) {
                    maxNumberIndex = j;
                }
            }

            int temp = numberArray[maxNumberIndex];
            numberArray[maxNumberIndex] = numberArray[i];
            numberArray[i] = temp;
        }

        for (int i = 1; i < numberArray.length - 1; i++) {
            if (numberArray[i] < numberArray[0] && numberArray[i] > numberArray[numberArray.length - 1]) {
                sum += numberArray[i];
            }
        }
        for (int number: numberArray) {
            System.out.print(number + " ");
        }
        System.out.print("\nСумма элементов массива между наименьшим и наибольшим равна: " + sum);
    }
}



