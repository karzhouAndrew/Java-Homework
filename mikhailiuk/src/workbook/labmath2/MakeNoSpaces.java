package workbook.labmath2;

/**
 * Created by Natashka on 16.02.2015.
 */
public class MakeNoSpaces {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void noSpaces() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}

