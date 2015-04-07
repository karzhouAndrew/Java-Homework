package homework.JD1.task14;

public class Test14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(min + " " + max);
        if (maxIndex < minIndex) {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum += array[i];
            }
        } else {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
