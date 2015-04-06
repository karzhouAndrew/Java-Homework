package homework.work3;

/*класс для генерирования и распечатки двумерного массива*/

public class ArrayOperation {
    public static void arrayPrint(int[][] array) {
        String str;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if (array[i][j] < 10) str = " ";
                else str = " ";
                System.out.print(array[i][j] + str);
            }
            System.out.println();
        }
    }

    public static void arrayCreatePrint(int[][] array) {
        int size = array.length - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
