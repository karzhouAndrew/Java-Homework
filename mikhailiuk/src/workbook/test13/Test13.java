package workbook.test13;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test13 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[][] rotatedArray = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = i * 10 + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                rotatedArray[j][array.length - 1 - i] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
