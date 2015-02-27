package workbook.lab17;


public class TextManager {


    public void searchWord(String text) {
        int n = 0;
        int word = 1;
        text = text.trim();
        while (n != -1) {
            int temp = n;
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

