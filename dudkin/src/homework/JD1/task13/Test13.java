package homework.JD1.task13;

public class Test13 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
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

