package classwork.workWithFile.task6;

import java.io.*;

/**
 * Created by Leonid on 11.03.2015.
 */
public class Load {

    public static void main(String[] args) throws IOException {

        MakeFile.make();

        FileWriter fileWithSomeDataType;
        try {
            fileWithSomeDataType = new FileWriter(MakeFile.FILE_PATH);
        } catch (IOException e) {
            return;
        }
        fileWithSomeDataType.write("Петров 8 9 7, $ Сидоров 10 7 7, Иванов 4 5 7  5,758  а 15,25");
        fileWithSomeDataType.close();

        BufferedReader fileInputStream = new BufferedReader(new FileReader(MakeFile.FILE_PATH));
        String res = fileInputStream.readLine();
        if (res != null) {
            System.out.println(res);
        }
        fileInputStream.close();
        PrintDataTape printDataTape = new PrintDataTape();
        printDataTape.print(res);
    }
}