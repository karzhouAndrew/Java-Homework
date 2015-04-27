package workbook.lab18;

import java.lang.String;

public class WordFrom {
    private String Total = "";
    private String str;

    WordFrom(String string) {
        str = string;
    }

    public void lastLetters() {
        char[] string = str.toCharArray();
        char[] latinChars = new char[52];
        int j = 0;
        for (char ch = 'A'; ch <= 'z'; ch++, j++) {
            latinChars[j] = ch;
            if (ch == 'Z') ch = 'a' - 1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (string[i] == ' ') {
                int k = 1;
                boolean b = false;
                while (i - k >= 0) {
                    if (string[i - k] != ' ') {
                        for (int l = 0; l < latinChars.length; l++)
                            if (string[i - k] == latinChars[l]) {
                                Total += string[i - k];
                                b = true;
                                break;
                            }
                    }
                    k++;
                    if (b) break;
                }
            } else {
                if (i == str.length() - 1)
                    if (this.include(string[i], latinChars)) {
                        Total += string[i];
                    } else {
                        int k = 1;
                        boolean b = false;
                        while (i - k >= 0) {
                            if (string[i - k] != ' ') {
                                for (int l = 0; l < latinChars.length; l++)
                                    if (string[i - k] == latinChars[l]) {
                                        Total += string[i - k];
                                        b = true;
                                        break;
                                    }
                            }
                            k++;
                            if (b) break;
                        }
                    }
            }
        }
    }

    public String getTotal() {
        return Total;
    }

    public boolean include(char ch, char[] latinChars) {
        boolean b = false;
        for (int i = 0; i < latinChars.length; i++)
            if (ch == latinChars[i])
                b = true;
        return b;
    }
}
