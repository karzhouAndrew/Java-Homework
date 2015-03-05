package classes.lab10.lab10_1;

import java.util.*;

/**
 * Сгенерируйте массив со случайными элементами. Количество элементов в массиве от 50 до 200.
 * Необходимо вывести на экран все уникальные элементы сгенерированного массива в порядке возрастания.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        int quantityNumbers = randBetween(50, 200);

        for (int i = 0; i < quantityNumbers; i++) {
            numbers.add(i, random.nextInt(400));
        }
        System.out.println(numbers);
        System.out.println();

        Set<Integer> numbersSet = new TreeSet<Integer>(numbers);
        System.out.println(numbersSet);
    }

    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
