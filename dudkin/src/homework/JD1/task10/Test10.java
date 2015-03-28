package homework.JD1.task10;

public class Test10 {
    public static void main(String[] args) {
        int number = 24;
        int counter = 0;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                ++counter;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }

    }
}
