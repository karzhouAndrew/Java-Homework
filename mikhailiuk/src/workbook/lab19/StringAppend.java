package workbook.lab19;

/**
 * Created by Natashka on 17.02.2015.
 */
public class StringAppend {
    private String str;

    public StringAppend(String str) {
        this.str = str;
    }

    public void stringAppend() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            builder.append(str);
        }
    }
}
