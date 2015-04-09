package workbook.add_lab;

/**
 * Created by Natashka on 15.02.2015.
 */
public class BracketsTest {
    public static void main(String[] args) {
        String str = "()())(()";
        BracketsSearch brsearch = new BracketsSearch();
        brsearch.setStr(str);
        brsearch.search();
    }
}
