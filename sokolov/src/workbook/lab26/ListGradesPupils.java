package workbook.lab26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListGradesPupils {
    private List<Pupil> pupils;

    public ListGradesPupils() {
        pupils = new ArrayList<Pupil>();
    }

    public void addPupils(int addNumber) {
        for (int i = 0; i < addNumber; i++) {
            pupils.add(i, (new Pupil()));
        }
    }

    public void deleteUnsatisfactoryMark() {
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i).getGrade() < 4) {
                pupils.remove(i);
            }
        }
    }

    public void showPupils() {
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
        System.out.println();
    }

    public int getHighGrade() {//ArrayList<Pupil> pupils    //Iterator<Pupil> iterator = new pupils.iterator();
        Iterator iterator = pupils.iterator();
        int highGrade = 0;
        Pupil pupil = null;
        while (iterator.hasNext()) {
            pupil = (Pupil) iterator.next();
            if (pupil.getGrade() > highGrade) {
                highGrade = pupil.getGrade();
            }
        }
        return highGrade;
    }
}