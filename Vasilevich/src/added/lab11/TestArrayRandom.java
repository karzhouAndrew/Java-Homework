package added.lab11;

import java.util.List;
import java.util.TreeSet;

/**
 * Created by Sam on 04.03.2015.
 * Сгенерируйте массив со случайными элементами. Кол-во элементов от 50 до 200. Вывести на экран все уникальные элементы
 * массива в ворядке возрастания
 */
public class TestArrayRandom {
    public static void main(String[] args) {
        ArrayRandom arrayRandom = new ArrayRandom();

        List<Integer> nonsortedArray = arrayRandom.getNonsortedArray();
        System.out.println("Not sorted list = " + nonsortedArray);

        TreeSet orderArray = arrayRandom.getSetArray();
        System.out.println("Sorted set = " + orderArray);
    }


}
