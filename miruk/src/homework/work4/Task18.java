package homework.work4;

/*вывести текст, составленный из последних букв слов*/

public class Task18 {
    public static void main(String[] args) {
        System.out.println("Текст: ");
        String str = ("Введите   сколько, чисел после запятой сложить.");
        System.out.println(str);
        String str_new = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if ((str.charAt(i - 1) == ':') || (str.charAt(i - 1) == ',') || (str.charAt(i - 1) == '.') || (str.charAt(i - 1) == '!') || (str.charAt(i - 1) == '?') || (str.charAt(i - 1) == ';') || (str.charAt(i - 1) == ')')) {
                    str_new += str.charAt(i - 2);
                } else if (str.charAt(i - 1) == ' ') {
                    i++;
                } else {
                    str_new += str.charAt(i - 1);
                }
            } else if ((str.charAt(i) == '.') || (str.charAt(i) == '!') || (str.charAt(i) == '?')) {
                str_new += str.charAt(i - 1);
            }
        }
        System.out.println(str_new);
    }
}