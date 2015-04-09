package workbook.lab26;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by vasilevich on 12.03.2015.
 */
public class Student {
    private String lastName;
    private ArrayList<Integer> marksArr = new ArrayList<Integer>();
    private final int minGoodMark = 7;

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

    public void checkMarks(){
        Iterator iterator = marksArr.iterator();
        while (iterator.hasNext()){
            if ((Integer)iterator.next() < minGoodMark){
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", marksArr=" + marksArr +
                "}\n";
    }
}
