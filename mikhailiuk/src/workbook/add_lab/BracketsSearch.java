package workbook.add_lab;

/**
 * Created by Natashka on 15.02.2015.
 */
public class BracketsSearch {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void search() {
        int leftbracket = 0;
        int rightbracket = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '(') {
                leftbracket++;
            } else if (symbol == ')') {
                rightbracket++;
            }
            if (rightbracket > leftbracket) {
                System.out.println("Скобки расставлены неправильно");
                return;
            }
        }
        if (leftbracket == rightbracket) {
            System.out.println("Скобки расставлены правильно");
            return;
        }
        System.out.println("Скобки расставлены неправильно");
        return;
    }
}
