package workbook.lab21;
/**
 * Created by Денис on 17.02.2015.
 */
public class SearchOfTheTegP {
    public static void main(String[] args) {
        String str = " Search of the <p id=\"p1\"> tag </p>";
        System.out.println("Line before transformation:\n" + str);
        TegP.change(str);
        System.out.println("Line after transformation:\n" + TegP.replace(str));
    }
}