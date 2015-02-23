package strings;

/**
 * Created by Рома on 16.02.2015.
 */
public class worddsAndSpaces {
    public static void main(String[] args) {
        String str = " Проверочная    строка для вычисления  количества слов в  строке   шщор щщрпш щшргщр зззотшщ    ";
        String string = str.trim();
        char [] text = string.toCharArray();

        System.out.println(text);
        int counter = 0;
        for (int i=1; i<text.length; i++){
            if (text[i] == ' ' && text[i] != text[i-1]){
                counter++;
            }
        }
System.out.print("В тексте " + (counter+1) + " слов");
    }
}
