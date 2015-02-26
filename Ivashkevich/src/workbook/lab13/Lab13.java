package workbook.lab13;

/*
 * Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать (при переворачивании нежела-тельно создавать еще один массив).
 */
public class Lab13 {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}





