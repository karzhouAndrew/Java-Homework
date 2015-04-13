package workbook.lab29;

/**
 * Created by Sam on 04.03.2015.
 * Имеется текст. Следует составить для него частотный словарь
 */
public class TestFreqLibrary {
    public static void main(String[] args) {
        String strTest = "i like restart windows i like restart";
        FreqLibrary freqLibrary = new FreqLibrary(strTest);
        System.out.println(freqLibrary);

    }
}
