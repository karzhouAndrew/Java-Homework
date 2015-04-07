package workbook.lab12;

import java.util.Random;

public class NumberOfTheMaxAssessment {
    public static void main(String[] args) {
        int n = 10;
        int maxNum = 0;
        int[] marks = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            marks[i] = rand.nextInt(10) + 1;
        }
        System.out.println("List of estimates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
            if (marks[i] > marks[maxNum]) {
                maxNum = i;
            }
        }
        System.out.print("\nNumber of the maximum assessment: ");
        for (int i = maxNum; i < n; i++) {
            if (marks[i] == marks[maxNum]) {
                System.out.print(" " + (i + 1));
            }
        }
    }
}

			