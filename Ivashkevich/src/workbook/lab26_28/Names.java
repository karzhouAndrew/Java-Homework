package workbook.lab26_28;

/**
 * Created by Leonid on 05.03.2015.
 */
public enum Names {
    VASYA, PETYA, TOLYA, VOVA, LESHA, ZHENYA, SLAVA, KOLYA, ARTUR, SASHA, ANDREY, DIMA;

    public static String getNameRandom() {

        String names = String.valueOf((Names.values()[(int) (Math.random() * Names.values().length)]));
        return names;
    }
}
