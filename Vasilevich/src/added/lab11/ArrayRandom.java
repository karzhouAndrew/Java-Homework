package added.lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Sam on 04.03.2015.
 */
public class ArrayRandom {
    private List<Integer> listArr;

    public ArrayRandom() {
        Random random = new Random();
        int arrLen = random.nextInt(150) + 50;

        listArr = new ArrayList<Integer>(arrLen);
        for (int i = 50; i < arrLen; i++) {
            listArr.add(random.nextInt(20));
        }
        this.listArr = listArr;
    }

    public List<Integer> getNonsortedArray() {
        return listArr;
    }

    public TreeSet<Integer> getSetArray() {
        return new TreeSet(listArr);
    }
}
