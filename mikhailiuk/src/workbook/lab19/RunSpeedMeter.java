package workbook.lab19;

/**
 * Created by Natashka on 17.02.2015.
 */
public class RunSpeedMeter {
    public static void main(String[] args) {
        String str = "Speed";
        long start = System.nanoTime();
        StringAdd add = new StringAdd(str);
        add.stringAdd();
        System.out.println("Время при использовании оператора сложения " + (System.nanoTime() - start));
        start = System.nanoTime();
        StringAppend append = new StringAppend(str);
        append.stringAppend();
        System.out.println("Время при использовании StringBuilder.append " + (System.nanoTime() - start));
    }
}
