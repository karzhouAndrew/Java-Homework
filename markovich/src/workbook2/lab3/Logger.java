package workbook2.lab3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void createLog(String ourException, String pathFile) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy | HH:mm:ss");
        bufferedWriter.write(simpleDateFormat.format(date) + " : " + ourException + "\n");
        bufferedWriter.close();
    }
}
