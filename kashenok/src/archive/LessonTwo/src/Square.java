import java.util.Random;

public class Square {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(15)+1;
        int b = rand.nextInt(20)+1;
        float m;
        int radius = 15;
        m = (float) Math.sqrt(a * a + b * b);
        if (m / 2 <= radius) {
            System.out.println("Прямоугольник можно перекрыть кругом с радиусом: " + radius + ", Половина диагонали прямоугольника равно: " + m +", а его стороны равны: a= "+a +" и b=" +b);
        } else {
            System.out.println("Прямоугольник нельзя перекрыть кругом с радиусом: " + radius + ", Половина диагонали прямоугольника равно: " + m +", а его стороны равны: a= "+a +" и b=" +b);
        }
    }
}
