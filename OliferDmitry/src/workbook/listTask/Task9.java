// Sozdat' i zapolnit' randomno spisok ocenok uchenikov (ArrayList). Najti MaxMark s pomoschju iteratora.
package workbook.listTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Pupil> pupilList = new ArrayList<Pupil>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            int randomIndex = (int)(Math.random() * Names.values().length);
            Names name = Names.values()[randomIndex];
            int mark = (int)(Math.random() * 4) + 2;
            pupilList.add(new Pupil(name, mark));
        }
        System.out.println(pupilList+ "\nMax mark is " + maxMark(pupilList));
    }

    private static int maxMark(List<Pupil> pupilList) {
        int max = 0;
        Iterator<Pupil> iter = pupilList.iterator();
        while (iter.hasNext()) {
            Pupil currentPupil =  iter.next();
            if (currentPupil.getMark() > max) {
                max = currentPupil.getMark();
            }
        }
        return max;
    }

}
