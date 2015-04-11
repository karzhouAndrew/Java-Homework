package workbook.lab32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Sam on 12.04.2015.
 */
public class BinFileNumber {
    private int punktMarkCounter;
    private int wordCounter;
    private List<Integer> numberArr;
    private final int RANDOM_NUM_COUNT = 20;

    public BinFileNumber() {
        numberArr = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < RANDOM_NUM_COUNT; i++) {
            numberArr.add(random.nextInt(50));
        }
    }

    public void saveToFile(String fileName) {
        try {
            DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
            for (int number : numberArr) {
                outputStream.writeInt(number);
            }
            outputStream.close();
            System.out.println("List before load = " + numberArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Integer> readFromFile(String fileName) {
        List<Integer> list = new ArrayList<Integer>();
        DataInputStream inputStream = null;
        try {
            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int num = 0;
        try {
            num = inputStream.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.add(num);

        while (true) {
            try {
                num = inputStream.readInt();
                list.add(num);
            } catch (IOException e) {
                break;
            }
        }
        return list;
    }

    private double calcAverage(List<Integer> arrayList) {
        double average = 0;
        for (int num : arrayList) {
            average += num;
        }
        average /= arrayList.size();
        return average;
    }

    public void fileLoader(String fileName) throws IOException {
        List<Integer> arrayList = readFromFile(fileName);
        System.out.println("List after load = " + arrayList);
        double average = calcAverage(arrayList);
        System.out.println("Average = " + average);
    }
}
