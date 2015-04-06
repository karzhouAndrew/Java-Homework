package homework.work8.Task8;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int integer = 20;
        for (int i = 0; i < integer; i++) {
            int value = (int) (Math.random() * 10);
            arrayList.add(value);
        }
        int size = arrayList.size();
        int temp = 0;

        for (int i = 0; i < size - 1; i++) {
            temp = arrayList.get(i);
            arrayList.remove(i);
            while (arrayList.contains(temp) == true) {
                int index = arrayList.indexOf(temp);
                arrayList.remove(index);
                size = arrayList.size() - 1;
            }
            if (i > size) {
                arrayList.add(temp);
            } else {
                arrayList.set(i, temp);
            }

            System.out.println(arrayList.get(i));
        }

    }

}
