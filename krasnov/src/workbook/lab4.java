package workbook;

/**
 * Имеется прямоугольное отверстие размерами a и b. Определить, можно ли его полностью закрыть
 * круглой картонкой радиусом r.
 */
public class lab4 {
    public static void main(String[] args) {
        double a = 10;
        double b = 6;
        double r = 4;

        double diagonal = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));

        if (r>=diagonal/2){
            System.out.println("Закрывает");
        }else{
            System.out.println("Не закрывает");
        }
    }
}
