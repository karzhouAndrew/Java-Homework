package workbook2.lab3;

import java.io.*;

public class Singleton {
    private static Singleton inst;
    String fileName = "Logger.txt";

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (inst == null) {
            inst = new Singleton();
        }
        return inst;
    }

    public void getError(String exception) {
        BufferedWriter fileOutputStream;
        try {
            fileOutputStream = new BufferedWriter(new FileWriter(fileName, true));
            fileOutputStream.write("\r\n" + DateAndTime.getDateAndTime());
            fileOutputStream.write("\r\n" + exception);

            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + exception);
        }
    }
}
