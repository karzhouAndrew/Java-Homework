package Cube;

/**
 * Created by Рома on 13.02.2015.
 */
public class CubeTest {
    public static void main(String[] args) {
        Cube cube1 = new Cube();
        int side = cube1.CubeSide();
        System.out.println("Объем куба равен: " + CubeVolume.SquareCalc(side));
        System.out.println("Площать поверхности куба равна: " + CubeSquare.CubeSquare(side));
    }
}
