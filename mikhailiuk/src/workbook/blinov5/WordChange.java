package workbook.blinov5;

/**
 * Created by Natashka on 20.02.2015.
 */
public class WordChange {

    public String wordChange(String str) {
        String[] sentence = str.split("[.\\x3f!]");
        StringBuilder builder = new StringBuilder();
        for (String tempSent : sentence) {
            tempSent = tempSent.trim();
            String[] oneSent = tempSent.split("\\s");
            String temp = oneSent[oneSent.length - 1];
            oneSent[oneSent.length - 1] = oneSent[0];
            oneSent[0] = temp;
            for (String sent : oneSent) {
                builder.append(sent).append(" ");
            }
        }
        return builder.toString();
    }
}
