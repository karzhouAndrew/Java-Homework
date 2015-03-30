// Прочитать текст java-программы и все слова public в объявлении атрибутов и методов класса заменить на private.
package workbook.classwork.files.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "main.java";
        File oldFile = new File(fileName);
        File newFile = new File("tmp_" + fileName);
        BufferedReader br = new BufferedReader(new FileReader(oldFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        String line = "";

        while ((line = br.readLine()) != null) {
            if (line.matches(".*public.*") && ! line.matches(".*class.*")) {
                int index = line.indexOf("public");
                line = line.substring(0, index) + "private" + line.substring(index + 6);
            }
            bw.write(line + "\r\n");
        }

        br.close();
        bw.close();
        oldFile.delete();
        newFile.renameTo(oldFile);
    }

}
