package lab4;

/*
Имеется прямоугольное отверстие размерами а на b. Определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 */
public class RectCirc {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int r = 6;
        if ((a * a + b * b) <= (r * 2) * (r * 2)) {
            System.out.println("Можно закрыть");
        } else {
            System.out.println("Нельзя закрыть");
        }
    }
}
