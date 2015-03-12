package workbook.blinov5;

/**
 * Created by Natashka on 20.02.2015.
 */
public class WordChangeTest {
    public static void main(String[] args) {
        String str = "Тест предложение такое. Замечательное очень предложение! Прошел ли я тест?";
        WordChange wordChange = new WordChange();
        System.out.println(wordChange.wordChange(str));
    }
}
