package workbook.lab18;


public class TextManager {

    public void searchLetter(String text) {
        String str = text.trim();
        String[] wordArray = str.split("[ ?,!-;:\"]+");

        for (String word : wordArray) {
            char symbol = word.charAt(word.length() - 1);
            System.out.print(symbol);
        }
    }
}






