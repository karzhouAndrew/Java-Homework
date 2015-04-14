package workbook.lab31;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Sam on 11.04.2015.
 */
public class NumberCounter {
    private int sum;
    private List numList;

    public NumberCounter() {
        numList  = new ArrayList();
    }

    private void addNumber(String num) {
        int number = Integer.parseInt(num);
        numList.add(number);
        sum += number;
    }

    private void AnalyseLine(String stringLine) {
        String[] wordsArr = stringLine.trim().split("[ a-zA-Z,.!?]+");
        for (String word : wordsArr) {
            if (!word.isEmpty()) {
                addNumber(word);
            }
        }
    }

    public void FileLoader(String fileName) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
        String stringLine = inputStream.readLine();
        while (stringLine != null) {
            AnalyseLine(stringLine);
            stringLine = inputStream.readLine();
        }
        System.out.println("Number list = " + numList);
        Set numSet = new TreeSet(numList);
        System.out.println("Number set = " + numSet);

    }

    @Override
    public String toString() {
        return "NumberCounter{" +
                "sum=" + sum +
                '}';
    }
}
