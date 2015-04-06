package homework.work5;

/*напишите 2 цикла выполняющих многократное сложение строк, один с пом. опретора сложения и String,
а другой с помощью StringBuilder. Сравните скорость их выполнения. */

public class Task19 {
    public static void main(String[] args) {
        String str1 = "Работа не волк - в лес не убежит";
        String str2 = "Работа не волк - в лес не убежит";
        long startTime = System.nanoTime() / 1000000;
        for (int i = 0; i < 20; i++) {
            str1 += str1;
        }
        long endTime = System.nanoTime() / 1000000;
        long allTime = endTime - startTime;
        System.out.println("Время на выполнение конкатенации StringBuffer " + allTime);

        startTime = System.nanoTime() / 1000000;
        StringBuilder strBuilder = new StringBuilder(str2);
        for (int i = 0; i < 100; i++) {
            strBuilder.append(str2);
        }
        endTime = System.nanoTime() / 1000000;
        allTime = (endTime - startTime);
        System.out.println("Время на выполнение конкатенации StringBuilder " + allTime);
    }
}
