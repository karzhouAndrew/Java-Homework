package classwork.class6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов,
 * которые имеют средний балл более 7
 *  */
public class Task5 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("surname_copy.txt");
        FileWriter out = new FileWriter("Surname.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
    }


}
