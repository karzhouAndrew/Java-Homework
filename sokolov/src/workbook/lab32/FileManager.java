package workbook.lab32;

import workbook.lab26.GeneratorGrade;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManager {
    public String generateStringOfNumbers(int number) {
        int i = 0;
        String allStrings = "";
        GeneratorGrade generatorGrade = new GeneratorGrade();
        String s;
        while (i < number) {
            s = String.valueOf(generatorGrade.generatorGrade());
            allStrings = allStrings + s + " ";
            i++;
        }
        System.out.println(allStrings);
        return allStrings;
    }

    public void recordToBinaryFile(String filePath, String string) {
        DataOutputStream outputStream;
        try {
            outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        try {
            outputStream.writeBytes(string);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error of record");
        }
    }

    public String readBinaryFile(String filePath) {
        DataInputStream inputStream = null;
        try {
            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        String res = "";
        try {
            res = inputStream.readLine();
        } catch (IOException e) {
            System.out.println("Error reading");
        }
        return res;
    }

    public float arithmeticMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (float) sum / array.length;
    }

    public int[] parseToIntArray(String string, int number) {
        int[] array = new int[number];
        Pattern pattern = Pattern.compile("[\\d]+");
        Matcher matcher = pattern.matcher(string);
        int i = 0;
        while (matcher.find()) {
            array[i] = Integer.valueOf(matcher.group());
            i++;
        }
        return array;
    }
}
