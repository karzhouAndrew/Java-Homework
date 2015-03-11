package workbook.classwork.files.task6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Файл содержит символы, слова, целые числа и числа с плавающей запятой. Определить все данные, тип которых вводится из командной строки.
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "students.txt";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
        List<Integer> listInt = new ArrayList<Integer>();
        List<Double> listDouble = new ArrayList<Double>();
        List<String> listWord = new ArrayList<String>();
        String strOfChar = "";

        String fullString = fileToString(bis);
        String[] splitted = fullString.split(" +");

        for (int i = 0; i < splitted.length; i++) {
            try {
                int isInt = Integer.parseInt(splitted[i]);
                listInt.add(isInt);
            } catch (NumberFormatException e1) {
                try {
                    double isDouble = Double.parseDouble(splitted[i]);
                    listDouble.add(isDouble);
                } catch (NumberFormatException e2) {
                    if (splitted[i].matches(".*[a-zA-Zа-яА-Я]+.*")) {
                        listWord.add(splitted[i]);
                    } else {
                        strOfChar += splitted[i];
                    }
                }
            }
        }
        strOfChar = strOfChar.replaceAll("[a-zA-Zа-яА-Я0-9]", "");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.toUpperCase().equals(Types.INT.toString())) {
            System.out.println(listInt);
        } else if (str.toUpperCase().equals(Types.DOUBLE.toString())) {
            System.out.println(listDouble);
        } else if (str.toUpperCase().equals(Types.WORD.toString())) {
            System.out.println(listWord);
        } else if (str.toUpperCase().equals(Types.CHAR.toString())) {
            System.out.println(strOfChar);
        } else System.out.println("Unknown type");
        scan.close();
    }

    public static String fileToString(BufferedInputStream bis) throws IOException {
        byte[] buffer = new byte[bis.available()];
        bis.read(buffer);
        String str = "";
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] != 10 && buffer[i] != 13) {
                str += (char)buffer[i];
            } else {
                str += " ";
            }
        }
        return str;
    }
}
