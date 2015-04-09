package classes.test10_1;

import java.util.*;

/**
 * Created by Natashka on 04.03.2015.
 */
public class RandomNumbersTest {
    public static void main(String[] args) {
        List <Integer> randList=new ArrayList<Integer>();
        Random random =new Random();
        for (int i=0;i<200;i++){
            randList.add(random.nextInt(20));
        }
        System.out.println(randList);
        Set<Integer> randSet=new TreeSet<Integer>();
        Iterator <Integer> iterator=randList.listIterator();
        while (iterator.hasNext()){
            randSet.add(iterator.next());
        }
        System.out.println(randSet);
    }
}
