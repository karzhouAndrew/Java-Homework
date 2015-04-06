package classwork.class4;

import java.util.Random;

public class NameGenerator {
    private static String[] names = {"SERGEY", "ANDREY", "ALEXEY", "DMITRIY", "EVGENIY", "VITALIY", "LEONID"};
    private static String[] surnames = {"IVANOU", "PETROU", "SIDOROU", "NIKOLAEV", "STEPANOV", "IGOREV", "SERGEEV"};

    public static String generateName(){
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static String generateSurname(){
        Random random = new Random();
        return surnames[random.nextInt(surnames.length)];
    }

}
