package workbook.lab19;

/**
 * Created by Sam on 20.02.2015.
 * Напишите 2 цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 * а другой с помощью StringBuilder  и метода append. Сравните скорость их выполнения
 */
public class CalcSpendTime {
    public static void main(String[] args) {

        int counter = 1000;
        long timeString = calcStringAdd(counter);
        long timeStrBldr = calcStrBldrAppend(counter);
        System.out.println("Time String = " + timeString);
        System.out.println("Time StringBuilder = " + timeStrBldr);
    }

    private static long calcStringAdd(int counter) {

        String strVal = "";
        long startTime = System.nanoTime();
        for (int ind = 0; ind < counter; ind++) {
            strVal += "l";
        }
        startTime = System.nanoTime() - startTime;
        return startTime;
    }

    private static long calcStrBldrAppend(int counter) {

        StringBuilder strVal = new StringBuilder();
        long startTime = System.nanoTime();
        for (int ind = 0; ind < counter; ind++) {
            strVal.append("l");
        }
        startTime = System.nanoTime() - startTime;
        return startTime;
    }

}
