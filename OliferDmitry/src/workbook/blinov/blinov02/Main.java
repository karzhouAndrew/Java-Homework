// Vyvesti vse predlojenija zadannogo texta v poriadke vozrastanija kolichestva slov v nih.
package workbook.blinov.blinov02;

public class Main {
    public static void main(String[] args) {
        String text = "Взять.. . любой русско?язычныи, текст;в:кото!ром не меньше !трёхсот ";

        for (String str : sentences(text))
            if (str.matches("(.*)[a-zA-Zа-яА-Я](.*)"))
                System.out.println(str);
    }

    public static String[] sentences(String text) {
        String[] splitted = text.split("[.|!|?]");
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].matches("(.*)[a-zA-Zа-яА-Я](.*)")) {
                words(splitted[i]);
            }
        }

        for (int i = 1; i < splitted.length; i++) {
            for (int j = i; j < splitted.length; j++) {
                if (words(splitted[j - 1]) > words(splitted[j])) {
                    String temp = splitted[j - 1];
                    splitted[j - 1] = splitted[j];
                    splitted[j] = temp;
                }
            }
        }
        return splitted;
    }

    public static int words(String text) {
        int wordCount = 0;
        String[] splitted = text.split("[\\p{Punct}|\\s]");
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].matches("(.*)[a-zA-Zа-яА-Я](.*)")) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
