package workbook;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class lab6 {
    public static void main(String[] args) {
        int num = 325657;
        int reverseNum = 0;

        while (num != 0) {
            reverseNum = reverseNum * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println(reverseNum);

    }
}
