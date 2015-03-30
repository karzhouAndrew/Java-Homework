// Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
package workbook.classwork.files.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "main.java";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter("_" + fileName));
        String line = "";

        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder(line);
            line = sb.reverse().toString();
            bw.write(line + "\r\n");
        }

        br.close();
        bw.close();
    }
}
