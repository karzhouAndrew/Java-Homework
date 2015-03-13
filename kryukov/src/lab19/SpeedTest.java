package lab19;

/*
Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, а другой с помощью
StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class SpeedTest {
    public static void main(String[] args) {
        int x = 10000;
        String strSum;
        String str1 = "Напишите два цикла выполняющих многократное сложение строк.";
        String str2 = "Сравните скорость их выполнения.";
        long startTime = System.nanoTime();
        for (int i = 0; i < x; i++) {
            strSum = str1 + str2;
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        long start2Time = System.nanoTime();
        for (int i = 0; i < x; i++) {
            StringBuilder strBuilder = new StringBuilder(str1);
            strBuilder.append("Сравните скорость их выполнения.");
        }
        long estimated2Time = System.nanoTime() - start2Time;
        System.out.println(estimated2Time);
    }
}
