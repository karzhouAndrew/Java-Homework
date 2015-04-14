package added.lab9;

import java.util.Random;

/**
 * Created by vasilevich on 25.02.2015.
 */
public enum FirstNameEnum {
    MIKHAIL, ANDREI, DMITRI, BORIS, VIKTOR, VLADIMIR, NIKOLAY, SERGEI, ALEXANDR;

    public static String generateFirstName() {
        Random random = new Random();
        return FirstNameEnum.values()[random.nextInt(FirstNameEnum.values().length)].toString();
    }
}
