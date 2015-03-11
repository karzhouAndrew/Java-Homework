package classwork.class6;

import java.io.*;
import java.util.Scanner;

/**
 * В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов,
 * которые имеют средний балл более 7
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("surname_copy.txt"));
        FileWriter pw = new FileWriter(new File("Surname.txt"));
        String[] student;
        String[] value;

        while (sc.hasNextLine()) {
            student = sc.nextLine().split("\\s+");
            double sum = 0;
            int number = 0;
            for (int i = 1; i < student.length; i++) {
                sum += Integer.parseInt(student[i]);
                number++;
            }
            double avg = sum / number;
            if (avg >= 7) {
                int i = 1;
                pw.write(student[0].toUpperCase());
                pw.write(" ");
                while (i < student.length) {
                    pw.write(student[i]);
                    pw.write(" ");
                    i++;
                }
                pw.write("   ");
            }
        }
        sc.close();
        pw.close();
    }
}
