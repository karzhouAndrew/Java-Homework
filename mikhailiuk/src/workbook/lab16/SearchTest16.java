package workbook.lab16;

/**
 * Created by Natashka on 15.02.2015.
 */
public class SearchTest16 {
    public static void main(String[] args) {
        String str = "Тестовая, строка? С разными! (всякими) знаками; препинания: \"которые\" - надо' найти.";
        PunctuationSearch punktSearch = new PunctuationSearch();
        punktSearch.setStr(str);
        System.out.println("Общее количество знаков препинания " + punktSearch.search());
    }
}
