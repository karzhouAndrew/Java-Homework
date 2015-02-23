import java.util.Random;

public class RublOrRubles {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = rand.nextInt(10000)+1;
        int lastNumber = sum % 10;
        String rubL = "ль";
        String rubLa = "ля";
        String rubLey = "лей";

        if (sum >= 5 && sum <= 20) {
            System.out.println("Общая сумма составляет: " + sum + " руб" + rubLey);
        } else if (lastNumber >= 5 && lastNumber <= 9 || lastNumber == 0 || lastNumber + 10 == 11) {
            System.out.println("Общая сумма составляет: " + sum + " руб" + rubLey);
        } else if (lastNumber >= 2 && lastNumber <= 4) {
            System.out.println("Общая сумма составляет: " + sum + " руб" + rubLa);
        } else if (lastNumber == 1) {
            System.out.println("Общая сумма составляет: " + sum + " руб" + rubL);
        } else {
            System.out.println("Общая сумма составляет: " + sum + " RUB");
        }
    }
}
