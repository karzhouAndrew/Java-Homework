// Прочитать текст Java-программы и удалить из него все лишние пробелы и табуляции, оставив только необходимые для разделения операторов.
package workbook.classwork.files.task8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "text.txt";
        File oldFile = new File(fileName);
        File newFile = new File("_" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(oldFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim().replaceAll(" +", " ");
            bw.write(line + "\r\n");
        }

        br.close();
        bw.close();
        oldFile.delete();
        newFile.renameTo(oldFile);
    }
}
