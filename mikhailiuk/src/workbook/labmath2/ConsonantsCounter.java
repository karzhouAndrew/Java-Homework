package workbook.labmath2;

/**
 * Created by Natashka on 16.02.2015.
 */
public class ConsonantsCounter {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public int consonantsCounter() {
        int counter = 0;
        char[] arr = {'й', 'ц', 'к', 'н', 'г', 'ш', 'щ', 'з', 'х', 'ъ', 'ф', 'в', 'п', 'р', 'л', 'д', 'ж', 'ч', 'с', 'м', 'т', 'ь', 'б'};
        for (int i = 0; i < str.length(); i++) {
            for (char x : arr) {
                if (x == str.charAt(i)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
