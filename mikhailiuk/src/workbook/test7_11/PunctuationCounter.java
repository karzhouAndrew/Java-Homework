package workbook.test7_11;

/**
 * Created by Natashka on 10.03.2015.
 */
public class PunctuationCounter {
    public int punctuationSearch(char symbol) {
        int counter = 0;
        if (symbol == '.' || symbol == ',' || symbol == '!' || symbol == '?' || symbol == ':' || symbol == ';' || symbol == '-') {
            counter++;
        }
        return counter;
    }
}
