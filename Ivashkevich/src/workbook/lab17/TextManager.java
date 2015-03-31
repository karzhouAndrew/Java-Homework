package workbook.lab17;


public class TextManager {

    private int n = 0;
    private int temp;
    private int word = 1;

    public void searchWord(String text) {
        text = text.trim();
        while (n != -1) {
            temp = n;
            n = text.indexOf(' ', n);
            if (n - temp == 0) {
                word--;
            }
            if (n != -1) {
                n++;
                word++;
            }
        }
        System.out.println("У нас есть " + word + " слов");
    }
}

