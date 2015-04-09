package workbook2.test3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Natashka on 15.03.2015.
 */
public class Logger {
    private Logger() {
    }

    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logException(Exception e) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("test.log"));
            writer.write(e.getMessage() + "\r\n");
            StackTraceElement[] stackTrace = e.getStackTrace();
            writer.write(stackTrace[0].getClassName() + "\r\n");
            writer.write(stackTrace[0].getFileName() + "\r\n");
            writer.write(stackTrace[0].getMethodName() + "\r\n");
            writer.write(stackTrace[0].getLineNumber() + "\r\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }
}

