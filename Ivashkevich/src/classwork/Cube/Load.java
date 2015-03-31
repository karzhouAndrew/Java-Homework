package classwork.Cube;

import java.util.Scanner;

/**
 * Created by Leonid on 13.02.2015.
 */
public class Load {
    public static void main(String[] args) {

        Cube cube = new Cube();
        cube.setColor("White");
        System.out.println("\nИсходый цвет объекта КУБ");
        System.out.println(cube);

        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите длинну стороны куба: ");
        double side = input.nextDouble();
        input.close();


        CubeManager cubeManager = new CubeManager();
        cubeManager.changeColor(cube);

        System.out.println("\nОбъект КУБ после обработки с заданными параметрами");

        System.out.println(cube);
        cube.calcVolume(side);
        cube.calcArea(side);

    }

}
