package lab13;

/*
Создать двухмерный массив, заполнить его случайными элементами, распечатать, перевернуть и снова распечатать
(при переворачивании нежелательно использовать еще один массив).
 */
public class ArrayShift {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int i, j, k = 1;
        for (i = 0; i < array.length; i++)
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                //array[i][j] = k;
                //k++;
            }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
        for (i = 0; i < array.length - 1 - i; i++)
            for (j = i; j < array.length - 1 - i; j++) {
                int temp = array[i][j];
                array[i][j] = array[array.length - 1 - j][i];
                array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = temp;
            }
        System.out.println();
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
    }
}
