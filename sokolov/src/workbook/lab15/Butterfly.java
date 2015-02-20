package workbook.lab15;

public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        int j;
        int[][] massif = new int[n][n];
        int j1 = n - 1;

        for (int i = 0; i < n; i++) {
            massif[i][i] = 1;
            massif[i][j1] = 1;
            j1--;
        }


        for (int i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                if (massif[i][j] == 1)
                    for (int k = j; k < n - j; k++)
                        massif[i][k] = 1;


        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(massif[i][j] + " ");
            System.out.println();
        }
    }
}	