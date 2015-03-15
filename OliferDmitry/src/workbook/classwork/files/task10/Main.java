// Прочитать строки из файла и поменять местами первое с последним словом в каждой строке.
package workbook.classwork.files.task10;

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
            String[] splitted = line.trim().split(" +");

            int length = splitted.length;
            if (length > 1) {
                line = line.replaceFirst(splitted[0], splitted[length - 1]);
                int lastWordIndex = line.lastIndexOf(splitted[length - 1]);
                int lastWordLength = splitted[length - 1].length();
                line = line.substring(0, lastWordIndex) + splitted[0] + line.substring(lastWordIndex + lastWordLength);
            }
            bw.write(line + "\r\n");
        }

        br.close();
        bw.close();
        oldFile.delete();
        newFile.renameTo(oldFile);
    }
}
