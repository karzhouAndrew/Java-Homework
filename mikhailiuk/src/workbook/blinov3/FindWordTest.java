package workbook.blinov3;

/**
 * Created by Natashka on 19.02.2015.
 */
public class FindWordTest {
    public static void main(String[] args) {
        String str = "Тест предложение такое. Замечательное предложение! Прошел я тест?";
        FindWord findWord = new FindWord();
        findWord.word(str);
    }
}
