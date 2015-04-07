// Создать файл и заполнить случайными числами. Отсортировать содержимое по возрастанию.
package workbook.classwork.files.task1;

import java.io.*;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "numbers.txt";
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(fileName));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(fileName));
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int quantity = 25;
        String line = "";
        Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < quantity; i++) {
            line += (((int)(Math.random()*100) + 1) + " ");
        }
        bw1.write(line);
        bw1.close();

        line = br.readLine();
        String[] arr = sort(line.split(" +"));
        line = "";
        for (int i = 0; i < arr.length; i++) {
            line += (arr[i] + " ");
        }
        bw2.write(line);

        bw2.close();
        br.close();
    }

    public static String[] sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (Integer.parseInt(arr[j-1]) > Integer.parseInt(arr[j])) {
                    String temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
