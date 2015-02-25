package workbook.lab16;

public class Manipulation {
    int n = 0;

    Manipulation(String string) {
        char[] str = string.toCharArray();
        char[] marks = {',', '!', ':', ';', '?', '`', '"', '.', '(', ')', '{', '}', '[', ']', '-', '/'};
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < marks.length; j++) {
                if (str[i] == marks[j]) {
                    n += 1;
                }
            }
        }
    }

    public int getNumber() {
        return n;
    }
}

