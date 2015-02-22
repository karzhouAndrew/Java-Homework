package workbook.lab19;

/**
 * Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения
 * и String, а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Load {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        double startTime = System.nanoTime();
        taskManager.testLoadTimeString();
        System.out.println((System.nanoTime() - startTime) / 1000000);
        startTime = System.nanoTime();
        taskManager.testLoadTimeStringBuilder();
        System.out.println((System.nanoTime() - startTime) / 1000000);


    }
}
