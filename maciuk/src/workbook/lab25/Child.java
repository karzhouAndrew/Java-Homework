package workbook.lab25;

/**
 * Created by Asus on 21.02.2015.
 */
public class Child {
    public static void main(String[] args) {
        String str = " His child is very pretty.He has 3 years old.";
        String str1 = str.replaceAll("\\d", "");
        System.out.println(str1.replaceAll("child", "children"));

    }
}