package classes.blinov1;

/**
 * Created by Natashka on 18.02.2015.
 */
public class SameWord {
    private String[] arr;

    public SameWord(String[] arr) {
        this.arr = arr;
    }

    public int findSameWordNumber() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
