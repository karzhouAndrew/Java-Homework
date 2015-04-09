package workbook.test7_13;

import java.io.*;

/**
 * Created by Natashka on 10.03.2015.
 */
public class BinaryFileRead {
    public void binaryRead() {
        DataInputStream stream = null;
        try {
            stream = new DataInputStream(new BufferedInputStream(new FileInputStream("binary.txt")));
            double sum=0;
            for (int i = 0; i < 20; i++) {
                double num=stream.readDouble();
                System.out.println(num);
                sum+=num;
            }
            System.out.println("Среднее арифметическое "+sum/20);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
