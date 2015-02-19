package workbook.labmath3;

/**
 * Created by Natashka on 17.02.2015.
 */
public class DeleteDigits {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String deleteDigits() {
        String[] array = str.split("\\d+");
        StringBuilder str2 = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        for (String str1 : array) {
            str2 = builder.append(str1);
        }
        return str2.toString();
    }
}
