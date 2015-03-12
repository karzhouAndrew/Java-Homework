package workbook.lab27.ver2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOperations {

    public static List<Integer> fillingList(int quantity) {
        Random random = new Random();
        List<Integer> numbersList = new ArrayList<Integer>();
        for (int i = 0; i < quantity; i++) {
            numbersList.add(i, random.nextInt(7));
        }
        return numbersList;
    }

    public static List<Integer> deleteDuplicate(List<Integer> integerList) {
        List<Integer> finalList = new ArrayList<Integer>();
        for (int i = 0; i < integerList.size(); i++) {
            boolean existNumber = duplicateSearch(i, integerList);
            if (!existNumber) {
                finalList.add(integerList.get(i));
            }
        }
        return finalList;
    }

    private static boolean duplicateSearch(int i, List<Integer> integerList) {
        boolean duplicate = false;
        for (int j = 0; j < integerList.size(); j++) {
            if (i != j && integerList.get(i).equals(integerList.get(j))) {
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }
}
