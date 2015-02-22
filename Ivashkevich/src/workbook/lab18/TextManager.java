package workbook.lab18;


public class TextManager {
    private String str;
    private String[] wordArray;
    private char symbol;

    public void searchLetter(String text) {
        str = text.trim();
        wordArray = str.split("[ ?,!-;:\"]+");

        for (String word : wordArray) {
            symbol = word.charAt(word.length() - 1);
            System.out.print(symbol);
        }
    }
}






