package workbook.lab15;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой».
 */
public class Lab15 {
    public static void main(String[] args) {
        int array[][] = new int[9][9];
        int i, j;

        for (i = 0; i < array.length / 2 + 1; i++) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i))) {
                    continue;
                } else {
                    array[i][j] = 1;
                }

            }

        }
        for (i = array.length - 1; i >= array.length / 2 + 1; i--) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i)) {
                    continue;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}

