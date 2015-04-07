package workbook.lab8_9;

/**
 * Надо получить ряд случайных чисел, и посчитать их произведение.
 * Ввод чисел прекращается, если очередным числом будет ноль. Найти и вывести наибольшее из них.
 */
public class Lab8_9 {
    public static void main(String[] args) {
        int maxCountOfRandomNumbers = 10;
        int result = 1;
        int maxNumber = 0;
        int randomNumber;

        System.out.println("\nНиже приведен ряд случайных чисел\n");
        for (int i = 0; i < maxCountOfRandomNumbers; i++) {
            randomNumber = (int) (Math.random() * 10);
            if (randomNumber == 0) {
                i--;
                continue;
            }
            result *= randomNumber;
            if (randomNumber > maxNumber) {
                maxNumber = randomNumber;
            }
            if (i == 0) {
                System.out.print(randomNumber);
            } else {
                System.out.print("  " + randomNumber);
            }
        }


        System.out.println('\n');
        System.out.println("произведение чисел из ряда равно    " + result + '\n');
        System.out.println("наибольшее число из ряда равно      " + maxNumber);
    }
}