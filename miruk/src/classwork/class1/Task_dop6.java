package classwork.class1;

/**
 * Имеестся строка, найти все ли скобки закрыты и сколько не закрыто
 */
public class Task_dop6 {
    public static void main(String[] args) {
        System.out.println("Исследуемая строка:");
        String str = "  Суть ()       (    проекта (Центр славянских языков) и культур  )        ";
        System.out.println(str);
        System.out.println();
        int open = 0, close = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            }
            if (str.charAt(i) == ')') {
                close++;
            }
        }
        System.out.println("В этой строке открывающихся скобок " + open + " и закрывающихся - " + close);
    }
}
