package Cube;

import java.util.Scanner;

public class Cube {

    public int CubeSide() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны куба: ");
        int sideLength = scan.nextInt();
        return sideLength;
    }



}
