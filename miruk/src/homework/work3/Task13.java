package homework.work3;

/*перевернутый на 90 градусов массив*/

public class Task13 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        System.out.println("Массив: ");
        int size = array.length - 1;
        ArrayOperation.arrayCreatePrint(array);


        for (int i = 0; i <= size / 2; i++) {
            for (int j = i; j <= size - i - 1; j++) {
                int temp = array[i][j];
                array[i][j] = array[size - j][i];
                array[size - j][i] = array[size - i][size - j];
                array[size - i][size - j] = array[j][size - i];
                array[j][size - i] = temp;
            }
        }

        System.out.println("Массив, повернутый по часовой стрелке: ");
        ArrayOperation.arrayPrint(array);
    }
}

