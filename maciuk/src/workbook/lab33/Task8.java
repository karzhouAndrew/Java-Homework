package workbook.lab33;

import java.util.*;

/**
 * Created by Asus on 04.03.2015.
 */
public class Task8 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new LinkedList<Integer>();
        Random generator = new Random();
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        randomNumbers.add(new Integer(generator.nextInt(10)));
        System.out.println("Коллекция со сдучайными цмфрами " + randomNumbers);
        Iterator<Integer> a = randomNumbers.iterator();
        LinkedHashSet<Integer> b = new LinkedHashSet<Integer>();
        while (a.hasNext()) {
            Integer n = a.next();
            b.add(n);
        }
        System.out.println("Изиененная коллекция из которой удалили одинаковые цмфры " + b);

    }
}

