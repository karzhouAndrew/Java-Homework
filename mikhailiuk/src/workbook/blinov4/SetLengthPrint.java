package workbook.blinov4;

/**
 * Created by Natashka on 20.02.2015.
 */
public class SetLengthPrint {
    private String str;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setLengthPrint() {
        int counter = 0;
        String[] printWord = new String[str.length()];
        for (String temp : printWord) {
            temp = "";
        }
        str = str.replaceAll(",", "");
        str = str.replaceAll("\\x3f", "??");
        String[] sentences = str.split("[.!\\x3f][\\s]");
        for (String sent : sentences) {
            if (sent.endsWith("?")) {
                String[] words = sent.split("\\s");
                for (String word : words) {
                    if (word.length() == length) {
                        printWord[counter] = word;
                        counter++;
                        System.out.println(word);
                    }
                }
            }
        }
        //        for (int i = 0; i < printWord.length; i++) {
        //   for (int j = i + 1; j < printWord.length; j++) {
        //     if (printWord[i].equalsIgnoreCase(printWord[j])) {
        //       System.out.println(printWord[i]);
        // }
        // }
        // } //for (String word:printWord){
        //  if (word !=null){
        //      System.out.println(word);
        //  }
        // }
    }
}
