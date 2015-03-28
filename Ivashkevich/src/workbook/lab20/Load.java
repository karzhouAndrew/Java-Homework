package workbook.lab20;

/**
 * Написать программу, выполняющую поиск в строке шестнадцате-ричных чисел, записаных
 * по правилам Java, с помощью регулярных выражений и вывести их на страницу.
 */
public class Load {
    public static void main(String[] args) {
        String text = (" 0x15ff амтвагн амвщмыдвщси уекгфвф 0x12fbc cдмиршгвпи восрп   ");
        TextManager textManager = new TextManager();
        textManager.searchHex(text);
    }
}

