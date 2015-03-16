package classes.lab4;

import java.util.*;

/**
 * Created by Asus on 04.03.2015.
 */
public class Task101 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<Integer>();
        Random generate = new Random();
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        randomNumbers.add(new Integer(generate.nextInt(30)));
        System.out.println("Массив заполненный случайными числами " + randomNumbers);
        TreeSet<Integer> sortedArray = new TreeSet<Integer>();
        ListIterator<Integer> iteratorNumbers = randomNumbers.listIterator();
        while (iteratorNumbers.hasNext()){
            int n = iteratorNumbers.next();
            sortedArray.add(n);
        }
        System.out.println("Отсортированный массив " + sortedArray);
    }
}
