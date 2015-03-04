package workbook.blinov8;

/**
 * Created by Natashka on 02.03.2015.
 */
public class SortingTest {
    public static void main(String[] args) {
        String str = "Лейтенант Фэрфакс повторил команды. В машинном отделении дверца котла с лязгом распахнулась," +
                " и кочегары принялись бросать уголь в топку лопата за лопатой. Палуба загрохотала от топота бегущих ног." +
                " Заметив на губах капитана улыбку, Фэрфакс чуточку расслабился. Служба под началом Уилкса не сахар при" +
                " любых обстоятельствах. Человек крутого, вспыльчивого нрава из за того, что его часто обходили по службе," +
                " капитан дожил до шестидесяти двух лет и был бы обречен до скончания дней просиживать штаны в роли" +
                " председателя совета маяка, не выручи его война.";
        StringCutter stringCutter = new StringCutter();
        WordsCounter wordsCounter = new WordsCounter();
        int wordsNumber = wordsCounter.counter(stringCutter.cutter(str));
        WordsSelection wordsSelection = new WordsSelection();
        String[] sortedWords = wordsSelection.selector(stringCutter.cutter(str), wordsNumber);
        VowelsSorting vowelsSorting=new VowelsSorting();
        sortedWords=vowelsSorting.vowelsSort(sortedWords);
        for (String sortedWord : sortedWords) {
            System.out.println(sortedWord);
        }
    }
}
