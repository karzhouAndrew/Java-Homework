package added.lab5;

/**
 * Created by Sam on 21.02.2015.
*/
public class CubeManager {

    public boolean calcCubeParams(CubeLib cube) {
        if (cube != null) {
            cube.setSquare(calcSquare(cube.getSideLen()));
            cube.setVolume(calcVolume(cube.getSideLen()));
            return true;
        } else {
            return false;
        }
    }

    private double calcSquare(double cubeSide) {
        return Math.pow(cubeSide, 2);
    }

    private double calcVolume(double cubeSide) {
        return Math.pow(cubeSide, 3);
    }
}
