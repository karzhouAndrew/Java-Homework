package workbook.task26;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            arrayList.add((int) (Math.random() * 11));
        }
        System.out.println("Список оценок: " + arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < 5) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println("Список положительных оценок:" + arrayList);
    }
}
