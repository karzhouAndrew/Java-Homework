package workbook.lab19;

/**
 * Created by Natashka on 17.02.2015.
 */
public class StringAdd {
    private String str;

    public StringAdd(String str) {
        this.str = str;
    }

    public void stringAdd() {
        for (int i = 0; i < 20; i++) {
            str += str;
        }
    }
}
