package workbook.lab19;

public class AdditionOfString {
    private String string;

    AdditionOfString(String str) {
        string = str;
    }

    long nanoTime() {
        String summerString = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < string.length(); i++)
            summerString += string;
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
