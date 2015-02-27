package workbook.lab5;

public class InducementOfRuble {
    public static void main(String[] args) {
        int a = 346;
        int a1 = a % 10;
        if (a1 == 1) {
            System.out.println(a + " rubl`");
        } else if ((a1 >= 2) && (a1 <= 4)) {
            System.out.println(a + " rublja");
        } else {
            System.out.println(a + " rublei");
        }
    }
}