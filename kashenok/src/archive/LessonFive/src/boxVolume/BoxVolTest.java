package boxVolume;

import java.util.Scanner;

public class BoxVolTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину параллелипепеда: ");
        double width = scan.nextDouble();
        System.out.println("Введите высоту параллелипепеда: ");
        double heigth = scan.nextDouble();
        System.out.println("Введите глубину параллелипепеда: ");
        double depth = scan.nextDouble();
        Box box1 = new Box(width, heigth, depth);

        double volume = box1.volume();
        System.out.println("Оъем куба с параметрами: ширина: " + width + ", высота: " + heigth + ", глубина: " + depth );
        System.out.println("РАВЕН: " + volume);


    }


}
