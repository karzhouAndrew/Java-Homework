// Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.
package workbook.classwork.files.task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "main.java";
        File oldFile = new File(fileName);
        File newFile = new File("_" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(oldFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        String line = "";

        while ((line = br.readLine()) != null) {
            line = convertToUpper(line);
            bw.write(line + "\r\n");
        }

        br.close();
        bw.close();
        oldFile.delete();
        newFile.renameTo(oldFile);
    }

    private static String convertToUpper(String line) {
        String[] splitted = line.split(" +");
        line = "";
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].matches("(.*[a-zA-Zа-яА-Я].*){3,}")) {
                splitted[i] = splitted[i].toUpperCase();
            }
            line += (splitted[i] + " ");
        }
        return line;
    }


}
