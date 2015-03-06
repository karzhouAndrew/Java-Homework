package classwork.class5.Task10_1;
/*Сгенерируйте массив со случайными элементами. Количество элементов в массиве от 50 до 200.
Необходимо вывести на экран все уникальные элементы сгенерированного массива в порядке возрастания.
 */

import java.util.*;

public class Task10_1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int size = 100;
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        Iterator<Integer> iterator = arrayList.iterator();
        Set<Integer> set = new TreeSet<Integer>();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            int count = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (temp == arrayList.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                set.add(temp);
            }
        }
        System.out.println(set);
    }
}
