package workbook.lab17;

public class Word {
    static int n = 0;

    Word(String str) {
        char[] Str = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
            if (Str[i] != ' ')
                if (i - 1 >= 0)
                    if (Str[i - 1] == ' ')
                        n++;
    }


    public int NumberW() {
        return n;
    }
}
