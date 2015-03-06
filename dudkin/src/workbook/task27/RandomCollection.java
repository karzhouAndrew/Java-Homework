package workbook.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomCollection {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            arrayList.add((int) (Math.random() * 21));
        }
        System.out.println("Список случайных чисел:" + arrayList);
        Set<Integer> uniqueList = new HashSet<Integer>(arrayList);
        System.out.println("Новый список:" + uniqueList);


    }
}