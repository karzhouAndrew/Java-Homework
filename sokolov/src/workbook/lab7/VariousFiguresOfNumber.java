package workbook.lab7;

public class VariousFiguresOfNumber {
    public static void main(String[] args) {
        int a = 6321;
        int one = a % 10;
        int two = (a % 100 - one) / 10;
        int three = (a % 1000 - one - two * 10) / 10;
        int four = (a - one - two * 10 - three * 100) / 1000;
        if ((one != two) && (one != three) && (one != four)) {
            if ((two != three) && (two != four) && (three != four)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
    