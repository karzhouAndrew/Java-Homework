package workbook.lab30;

import java.io.*;

/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */
public class Load {

    public static void main(String[] args) throws IOException {

        FileWriter text;
        try {
            text = new FileWriter("File_task30.txt");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        text.write("Создать файл с текстом, прочитать, подсчитать: в тексте количество! знаков ?препинания и слов.");
        text.close();

        BufferedReader fileInputStream = new BufferedReader(new FileReader("File_task30.txt"));
        String res = fileInputStream.readLine();
        StringBuffer textRead = new StringBuffer();
        while (res != null) {
            textRead.append(res);
            res = fileInputStream.readLine();
        }
        fileInputStream.close();
        System.out.println(textRead);
        String textReadToString = textRead.toString().trim();
        System.out.println(textReadToString.split("[ ]+").length + " слов");
        System.out.println(textReadToString.split("[,.:!?;]+").length + " знаков препинания");

    }
}