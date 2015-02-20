package workbook.lab11;

public class NShareOn3 {
    public static void main(String[] args) {
        int initialNumber = -9;
        int n = 4;
        int n1 = 0;
        int amount = 0;
        for (int i = initialNumber; n1 < n; i++)
            if (i % 3 == 0) {
                n1 += 1;
                amount += i;
            }
        System.out.println("the sum of the first " + 4 + " of numbers which share on 3 since " + initialNumber + ": " + amount);
    }
}

	