package added.lab14;

import java.util.Random;

/**
 * Created by vasilevich on 25.02.2015.
 */
public enum LastNameEnum {
    VASILEVICH, SAVKO, SAVITSKI, ASEDOVSKI, ZIMOGOROV, SHUSTOVSKI, ANDREEV, MASLOVSKI, IVANOV, PETROV, SIDOROV,
    MALCHENKOV;

    public static String generateLastName() {
        Random random = new Random();
        return LastNameEnum.values()[random.nextInt(LastNameEnum.values().length)].toString();
    }

}
