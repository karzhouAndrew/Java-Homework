package workbook.blinov7;

/**
 * Created by Natashka on 20.02.2015.
 */
public class VowelsSortingTest {
    public static void main(String[] args) {
        String str = "Тест лотерея такая. Замечательное предложение! Прошел он тестирование для программирования на ява?";
        VowelsSorting vowelsSorting = new VowelsSorting();
        vowelsSorting.setStr(str);
        vowelsSorting.vowelsSorting();
    }
}
