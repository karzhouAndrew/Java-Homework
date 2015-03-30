package workbook.blinov.blinovStringMethods;
// V etom classe realizovany raznye vspomogatelnye metody dlia zadach Blinova
public class StringMethods {

    public static String[] stringToSentences (String text) {
        String splitted[] = text.split("[.|!|?]"), result = "";
        for (int i = 0; i < splitted.length; i++) {
            if (! splitted[i].matches("(.*)[a-zA-zА-Яа-я](.*)")) {
                splitted[i] = null;
            } else {
                result += (splitted[i] + ".");
            }
        }
        return  result.substring(0, result.length()-1).split("[.]");
    }

    public static String[] stringToWords (String text) {
        String[] splitted = text.split("[\\p{Punct}|\\s]+");
        return splitted;
    }

 /*   public static String[] sortWordsByABC (String[] words) {

        return null;
    }*/
}

