package workbook.classwork.files.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов, средний балл
// которых больше 7. Для вывода результатов создать новую директорию и файл средствами File.
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "students.txt";
        FileOutputStream fos1 = new FileOutputStream(new File(fileName));
        int studQuantity = 7;
        for (int i = 0; i < studQuantity; i++) {
            String studData = "" + setRand2ndName() + setRandMark() + "\r\n";
            byte[] studDataArray = studData.getBytes();
            fos1.write(studDataArray);
        }
        fos1.close();

        BufferedReader br1 = new BufferedReader(new FileReader(new File(fileName)));
        List<String> studList = new ArrayList<String>();
        String line, secondName;
        double averageMark;
        for (int i = 0; i < studQuantity; i++) {
            line = br1.readLine();
            if (getAverageMark(line) > 7 && line != null) {
                line = line.toUpperCase();
            }
            studList.add(line);
        }
        br1.close();

        FileOutputStream fos2 = new FileOutputStream(new File("e:/", fileName));
        for (int i = 0; i < studQuantity; i++) {
                fos2.write((studList.get(i)+"\r\n").getBytes());
        }

        fos2.close();
    }

    public static String setRand2ndName() {
        return SecondNames.values()[(int)(Math.random() * SecondNames.values().length)].toString().toLowerCase();
    }

    public static String setRandMark() {
        int randQuantity = (int)(Math.random() * 6) + 2;
        String result = "";
        for (int i = 0; i < randQuantity; i++) {
            result += " " + ((int)(Math.random() * 8) + 3);
        }
        return result;
    }

    public static String get2ndName(String line) {
        return line.split(" ")[0];
    }

    public static double getAverageMark(String line) {
        int sum = 0;
        String[] splitted = line.split(" ");
        for (int i = 1; i < splitted.length; i++) {
            sum += Integer.parseInt(splitted[i]);
        }
        double result = (double)sum / (double)(splitted.length - 1);
        return result;
    }
}
