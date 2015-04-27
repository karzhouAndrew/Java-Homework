package workbook.lab17;

public class Word {
    static int n = 0;

    Word(String string) {
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i++)
            if (array[i] != ' ')
                if (i - 1 >= 0)
                    if (array[i - 1] == ' ')
                        n++;
    }


    public int numberW() {
        return n;
    }
}
