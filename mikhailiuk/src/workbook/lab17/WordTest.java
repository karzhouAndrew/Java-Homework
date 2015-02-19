package workbook.lab17;

/**
 * Created by Natashka on 15.02.2015.
 */
public class WordTest {
    public static void main(String[] args) {
        String str = " А я иду    гуляю по    Москве и я пройти еще    смогу ";
        WordCounter wc = new WordCounter();
        wc.setString(str);
        System.out.println(wc.counter());
        System.out.println(wc.counter1());
    }
}
