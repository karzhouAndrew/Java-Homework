package workbook.lab16;

public class Manipulation {
    int n = 0;

    Manipulation(String str) {
        char[] Str = str.toCharArray();
        char[] Marks = {',', '!', ':', ';', '?', '`', '"', '.', '(', ')', '{', '}', '[', ']', '-', '/'};
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < Marks.length; j++) {
                if (Str[i] == Marks[j])
                    n += 1;
            }
    }

    public int getNumber() {
        return n;
    }
}

