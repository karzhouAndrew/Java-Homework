package added.lab12;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by vasilevich on 05.03.2015.
 * Создать итератор для массива строк
 */
public class StringListTest {
    public static void main(String[] args) {

        String strVal = "Буду скидывать еще материал для чтения";

        StringList list = new StringList(strVal);

        System.out.println("Начальный массив");
        Iterator iterator = list.iterator();
        String val = (String) iterator.next();
        System.out.println(val);
        int indForDelete = 0;
        while (iterator.hasNext()) {
            val = (String) iterator.next();
            System.out.println(val);
            if (indForDelete++ == 1) {
                System.out.println("УДАЛЯЕМ " + val);
                iterator.remove();
            }
        }

        System.out.println("После редактирования");
        iterator = list.iterator();
        val = (String) iterator.next();
        System.out.println(val);
        while (iterator.hasNext()) {
            val = (String) iterator.next();
            System.out.println(val);
        }
    }
}
