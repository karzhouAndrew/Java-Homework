// Удалить из файла все слова, содержащие от 3 до 5 символов, но при этом из каждой строки должно быть удалено только
// максимальное четное количество таких слов.
package workbook.classwork.files.task7;

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
            int count = necessaryDeleteWordCount(line);
            line = recursiveDelete(line, count);
            bw.write(line + "\r\n");
        }

        br.close();
        bw.close();
        oldFile.delete();
        newFile.renameTo(oldFile);

    }

    public static int necessaryDeleteWordCount(String line) {
        int count = 0;
        String[] splitted = line.split("\\p{Punct}|\\p{Space}");
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].length() > 2 && splitted[i].length() < 6) {
                count++;
            }
        }
        if (count % 2 == 1) {
            count--;
        }
        return count;
    }

    public static String recursiveDelete(String line, int count) {
        if (count == 0) {
            return line;
        }
        String[] splitted = line.split("\\p{Punct}|\\p{Space}");
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].length() > 2 && splitted[i].length() < 6) {
                line = line.replaceFirst(splitted[i], "");
                break;
            }
        }
        return recursiveDelete(line, --count);
    }
}
