package strings;

import java.nio.charset.CharsetDecoder;

public class Unit16ForAllSymbols {
    public static void main(String[] args) {
        String text = " eh h /gh AE. hh.h GH /ghnj;non o ,  mON jopnj n : k jbilbk  ,lpmk  - nijb b : mk;nl; n";
        String punkt = ",.:;&!- ";
        char[] letters = text.toCharArray();
        char[] symbols = punkt.toCharArray();

        int sum = 0;


       for (int i = 0; i < symbols.length; i++) {
            char temp1;
            temp1 = symbols[i];
            for (int j = 0; j < letters.length; j++) {
                char temp2;
                temp2 = letters[j];
                if (temp1 == temp2) {
                    sum++;
                }
            }

        }
        System.out.println(sum);
    }
}
