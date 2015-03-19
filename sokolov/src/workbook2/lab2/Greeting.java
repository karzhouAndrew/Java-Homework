package workbook2.lab2;

/**
 * Создать программу, которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров. Если входные параметры отсутствуют,
 * программа должна выдавать сообщение на английском.
 */
public class Greeting {
    public static void main(String[] args) {
        int argsLength = args.length;
        Comparison comparison = new Comparison();
        switch (argsLength) {
            case 0:
                comparison.setStrings();
                break;
            case 1:
                comparison.setStrings(args[0]);
                break;
            case 2:
                comparison.setStrings(args[0], args[1]);
                break;
            default:
                comparison.setStringsExcess();
        }
    }
}
