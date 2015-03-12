package workbook.test7_13;

import java.io.*;
import java.util.Random;

/**
 * Created by Natashka on 10.03.2015.
 */
public class BinaryFileWrite {
    public void randomWrite() {
        Random random = new Random();
        DataOutputStream stream = null;
        try {
            stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("binary.txt")));
            for (int i=0;i<20;i++){
                stream.writeDouble(random.nextDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
