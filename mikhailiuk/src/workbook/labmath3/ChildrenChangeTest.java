package workbook.labmath3;

/**
 * Created by Natashka on 17.02.2015.
 */
public class ChildrenChangeTest {
    public static void main(String[] args) {
        String str = "You8 a9re child, b236ut not chi123ldren after 1 child";
        ChildrenChange childrenChange = new ChildrenChange();
        DeleteDigits deleteDigits = new DeleteDigits();
        deleteDigits.setStr(str);
        str = deleteDigits.deleteDigits();
        childrenChange.setStr(str);
        str = childrenChange.childrenChange();
        System.out.println(str);
    }
}
