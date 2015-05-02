package workbook2.workbook2Tasks.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger ourInstance = new Logger();

    public static Logger getInstance() {
        if (ourInstance == null) {
            ourInstance = new Logger();
        }
        return ourInstance;
    }

    private Logger() {
    }

    public void log(String errorMessage) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:SS (dd-MM-yyyy)");
        bw.write(simpleDateFormat.format(date) + " --> " + errorMessage + "\r\n");
        bw.close();
    }
}
