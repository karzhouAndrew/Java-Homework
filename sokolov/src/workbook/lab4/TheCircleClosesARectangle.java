package workbook.lab4;

public class TheCircleClosesARectangle {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 2.0;
        double r = 4.0;
        double R;
        R = Math.sqrt(a * a + b * b) / 2;
        if (R < r) {
            System.out.println("be possible");
        } else {
            System.out.println("be impossible");
        }
    }
}