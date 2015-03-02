package classes.lab1;

/**
 * Created by Asus on 21.02.2015.
 */
public class Lesson2 {
    public static void main(String[] args) {
        String str = "Hello world yes of course my little";
        String[] words = str.split(" +");
        String print = null;
        String compare = null;
        String t = null;
        String compare1 = null;
        String compare2 = null;
        int times1 = 0;
        int times2 = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                print = words[i];
                compare = words[j];
                if (print.length() < compare.length()) {
                    t = words[i];
                    words[i] = words[j];
                    words[j] = t;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        here:
        for (int i = 0; i < words.length - 1; i++) {
            compare1 = words[i];
            compare2 = words[i + 1];
            if (compare1.length() != compare2.length()) {
                builder.append(words[i]).append(" ");
                continue here;
            }
            if (compare1.length() == compare2.length()) {
                char[] alph = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
                here1:
                for (int f = 0; f < alph.length; f++) {
                    if (compare1.charAt(0) == alph[f]) {
                        break here1;
                    }
                    times1++;
                }
                here1:
                for (int f = 0; f < alph.length; f++) {
                    if (compare2.charAt(0) == alph[f]) {
                        break here1;
                    }
                    times2++;
                }
            }
            if (times1 < times2) {
                builder.append(words[i]).append(" ").append(words[i + 1]).append(" ");
                i++;
            } else {
                builder.append(words[i + 1]).append(" ").append(words[i]).append(" ");
                i++;
            }
        }
        System.out.println(builder);
    }

}
