package classes.lab10.lab10_1;

import java.util.*;

/**
 * Сгенерируйте массив со случайными элементами. Количество элементов в массиве от 50 до 200.
 * Необходимо вывести на экран все уникальные элементы сгенерированного массива в порядке возрастания.
 */
public class Main {
    public static void main(String[] args) {

        int quantityNumbers = GenerateRandomNumbers.randBetween(50, 200);

        List<Integer> numbers = ListOperations.fillingList(quantityNumbers);
        System.out.println(numbers);

        Set<Integer> numbersSet = new TreeSet<Integer>(numbers);
        System.out.println(numbersSet);
    }
}
