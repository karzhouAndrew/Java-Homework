package workbook.lab30;

import java.io.*;

public class FileOperations {
    public static final String PATH = "markovich/src/workbook/lab30/filename.txt";

    public static void writerFile(String str) {
        try {
            File file = new File(PATH);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.close();

            System.out.println("File was created.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readerFile() {
        BufferedReader bufferedReader = null;
        try {
            String sCurrentLine;
            bufferedReader = new BufferedReader(new FileReader(PATH));
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
