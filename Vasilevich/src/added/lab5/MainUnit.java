package added.lab5;

/**
 * Created by Sam on 21.02.2015.
 * Есть Класс куб.
 * Нужно найти:
 * 1) Площадь куба
 * 2) Объем куба
 * 3) Покрасить куб в определенный цвет
 * <p/>
 * Обязательное использование
 * Конструкторов с параметрами и без параметров.
 * Желательно чтобы все подсчеты делал отдельный класс.
 */
public class MainUnit {
    public static void main(String[] args) {
        CubeLib cube1 = new CubeLib();
        CubeLib cube2 = new CubeLib(3, "Red");

        CubeManager cubeManager = new CubeManager();
        cubeManager.calcCubeParams(cube1);
        cubeManager.calcCubeParams(cube2);
        System.out.println(cube1);
        System.out.println(cube2);
    }
}
