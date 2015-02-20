// Najti takoe slovo v pervom predlojenii, kotorogo net ni v odnom iz ostalnyh predlojenij
package workbook.blinov.blinov03;

public class Main {

    static String firstSent = "";
    static String[] words;

    public static void main(String[] args) {
        String text = "999! !!Hello, , World;hi, man!.Взять,ONE-и: любой,в руссо?язычныи,текст:и ;в:кото!ром не hello Hi, меньше на !трёхсот взять.  100";
        sentences(text);
        words = firstSent.split("[\\p{Punct}|\\s]");
        for (int i = 0; i < words.length; i++) {
            String subStr = text.substring(text.indexOf(firstSent) + firstSent.length()).toLowerCase();
            if (words[i].length() > 0 && !subStr.matches("(.*)" + words[i].toLowerCase() + "(.*)")) {
                System.out.println(words[i]);
            }
        }
    }

    public static String sentences(String text) {
        String[] splitted = text.split("[.|!|?]");
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].matches("(.*)[a-zA-Zа-яА-Я](.*)")) {
                firstSent = splitted[i];
                break;
            }
        }
        return firstSent;
    }
}
