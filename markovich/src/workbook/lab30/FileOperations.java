package workbook.lab30;

import java.io.*;

public class FileOperations {
    public static void writerFile() {
        try {

            String str = "В понедельник Apple проведет презентацию Apple Watch, первого полностью нового продукта с момента выпуска iPad в 2010 году.";
            File file = new File("markovich/src/workbook/lab30/filename.txt");

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
        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("markovich/src/workbook/lab30/filename.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


}
