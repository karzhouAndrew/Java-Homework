package workbook.lab15;

/**
 * Created by Sam on 20.02.2015.
 * Создать двухмерный квадратный массив и заполнить его бабочкой
 */
public class CreateMatrix {
    public static void main(String[] args) {
        int matrixLen = 15;
        int matrix[][] = new int[matrixLen][matrixLen];
        int minInd;
        int maxInd;
        for (int indY = 0; indY < matrixLen; indY++) {
            for (int indX = 0; indX < matrixLen; indX++) {
                if (indY < (matrixLen - 1 - indY)) {
                    minInd = indY;
                    maxInd = matrixLen - 1 - indY;

                } else {
                    minInd = matrixLen - 1 - indY;
                    maxInd = indY;

                }
                if ((indX >= (minInd) && (indX <= (maxInd)))) {
                    matrix[indY][indX] = 1;

                }
                System.out.print(matrix[indY][indX] + "   ");
            }
            System.out.println("");
        }
    }
}
