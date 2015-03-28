package classwork.collections10_1;

import java.util.*;

/**
 * Created by Leonid on 04.03.2015.
 */
public class generatorRandomNumbers {
    public static void main(String[] args) {


        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            array.add((int) (Math.random() * 50));
        }
        System.out.println(array);

        Set<Integer> setArray = new TreeSet<Integer>();
        int j = 0;
        for (Integer i : array) {
            if (setArray.add(i)) {
            } else {
                j++;
            }
        }
        System.out.println(setArray);
        System.out.println(j + " исключений");
    }
}
