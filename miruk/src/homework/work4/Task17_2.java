package homework.work4;

/*имеется строка с текстом. подсчитать количество слов в тексте ЧЕРЕЗ СHAR*/

public class Task17_2 {
    public static void main(String[] args) {
        System.out.println("Исследуемая строка:");
        String str = "  Суть               проекта “Центр славянских языков и культур”          ";
        System.out.println(str);
        System.out.println();
        int n = 0;
        int index = 0;
        while (index != -1) {
            index = str.indexOf(' ', index + 1);
            if (str.indexOf(' ', index + 1) - 1 != index && index != -1)
                n++;
        }
        System.out.println("В этой строке " + n + " слов");
    }
}
