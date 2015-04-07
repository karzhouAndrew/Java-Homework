package workbook.lab19;

import java.lang.String;

public class AdditionOfLines {
    public static void main(String[] args) {
        String str = "This is test string!";
        AdditionOfString Object1 = new AdditionOfString(str);
        AdditionOfStringBuilder Object2 = new AdditionOfStringBuilder(str);
        System.out.println("String = " + Object1.nanoTime());
        System.out.println("StringBuilder = " + Object2.nanoTime());
    }
}
