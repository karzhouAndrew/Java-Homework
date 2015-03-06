package classes.lab10.lab10_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOperations {

    public static List<Integer> fillingList(int quantity) {
        Random random = new Random();
        List<Integer> numbersList = new ArrayList<Integer>();
        for (int i = 0; i < quantity; i++) {
            numbersList.add(i, random.nextInt(400));
        }
        return numbersList;
    }

}
