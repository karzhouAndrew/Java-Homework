package workbook.blinov9;

import workbook.blinov8.StringCutter;

/**
 * Created by Natashka on 02.03.2015.
 */
public class LetterSortingTest {
    public static void main(String[] args) {
        String str = "Лейтенант Фэрфакс повторил команды. В машинном отделении дверца котла с лязгом распахнулась," +
                " и кочегары принялись бросать уголь в топку лопата за лопатой. Палуба загрохотала от топота бегущих ног." +
                " Заметив на губах капитана улыбку, Фэрфакс чуточку расслабился. Служба под началом Уилкса не сахар при" +
                " любых обстоятельствах. Человек крутого, вспыльчивого нрава из за того, что его часто обходили по службе," +
                " капитан дожил до шестидесяти двух лет и был бы обречен до скончания дней просиживать штаны в роли" +
                " председателя совета маяка, не выручи его война.";
        char letter='е';
        StringCutter stringCutter = new StringCutter();
        LetterCounter letterCounter = new LetterCounter();
        String [] words=stringCutter.cutter(str);
        int [] letterNumbers=letterCounter.counter(words,letter);
        WordsSorting wordsSorting=new WordsSorting();
        words=wordsSorting.sortingByLetterNum(words,letterNumbers);
        for (String word:words) {
            System.out.println(word);
        }
    }
}
