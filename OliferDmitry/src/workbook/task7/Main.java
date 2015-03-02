package workbook.task7;

import java.util.ArrayList;
import java.util.List;
// Sozdat' ArrayList ocenok uchenikov i zapolnit' randomno. Udalit' neudy iz spiska
public class Main {
    public static void main(String[] args) {
        List<Pupil> list = new ArrayList<Pupil>();
        int listSize = 10;
        for (int  i = 0; i < listSize; i++) {
            Names name = Names.values()[(int)(Math.random() * Names.values().length)];
            int mark = (int)(Math.random() * 4) + 2;
            list.add(new Pupil(name, mark));
        }
        System.out.println(list);
        for (int i = listSize - 1; i >= 0; i--) {
            if (list.get(i).getMark() < 3) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
