package workbook.lab27;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Sam on 12.03.2015.
 */
public class NumberCollection {
    private List<Integer> numList = new ArrayList<Integer>();

    public void addNumberToList(int newVal){
        numList.add(newVal);
    }

    public void checkRepetitiveNums(){
        Set<Integer> checkSet = new TreeSet<Integer>(numList);
        numList.clear();
        numList.addAll(checkSet);
    }

    @Override
    public String toString() {
        return "NumberCollection{" +
                "numList=" + numList +
                '}';
    }
}
