package workbook.lab19;

import java.lang.String;

public class AdditionOfStringBuilder {
    private StringBuilder stringB = new StringBuilder("");
    private String string;

    AdditionOfStringBuilder(String str) {
        string = str;
    }

    long nanoTime() {
        long startTime = System.nanoTime();
        for (int i = 0; i < string.length(); i++)
            stringB.append(string);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
