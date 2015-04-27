package workbook.lab30;

public class PunctuationCharacters {
    int n = 0;

    PunctuationCharacters() {
    }

    public int getNumber(String str) {
        char[] Str = str.toCharArray();
        char[] Marks = {',', '!', ':', ';', '?', '`', '"', '.', '(', ')', '{', '}', '[', ']', '-', '/'};
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < Marks.length; j++) {
                if (Str[i] == Marks[j])
                    n += 1;
            }
        return n;
    }
}

