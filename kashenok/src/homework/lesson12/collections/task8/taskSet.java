package homework.lesson12.collections.task8;


import homework.lesson11.annotationTwo.Init;

import java.util.*;

public class taskSet {

    public static void main(String[] args) {
        Random rand = new Random();
  /*      Set<Integer> intSet = new HashSet<Integer>();

        for (int i = 0; i < rand.nextInt(100); i++) {
            intSet.add(rand.nextInt(50));
        }


        System.out.println(intSet);
*/
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < rand.nextInt(100) + 15; i++) {
            intList.add(rand.nextInt(50));
        }
        System.out.println("intList = " + intList);
        System.out.println();

//If sort is doesn't matter
        
        Set <Integer> newSet = new HashSet<Integer>(intList);
        System.out.println("Unsorted SET: newSet = " + newSet);
        
        // If sort is important
        System.out.println();
        Set <Integer> newSet1 = new LinkedHashSet<Integer>(intList);
        System.out.println("Sorted SET: newSet1 = " + newSet1);

    }
}
