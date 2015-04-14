package workbook.lab28;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by vasilevich on 12.03.2015.
 */
public class Student {
    private String lastName;
    private ArrayList<Integer> marksArr = new ArrayList<Integer>();

    public Student() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean addMark(int mark){
        return marksArr.add(mark);
    }

    public void addMarks(int[] marks){

        for(int mark : marks) {
            marksArr.add(mark);
        }

    }

    public int findMaxMark(){
        Iterator iterator = marksArr.iterator();
        int maxMark = Integer.MIN_VALUE;
        if (iterator.hasNext()) {

            int mark = (Integer) iterator.next();
            if (mark > maxMark) {
                maxMark = mark;
            }
            while (iterator.hasNext()) {
                mark = (Integer) iterator.next();
                if (mark > maxMark) {
                    maxMark = mark;
                }
            }
        }

        return maxMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", marksArr=" + marksArr +
                "}\n";
    }
}
