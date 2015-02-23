package gift;

import java.util.Random;

public class NamesGenerator {
    private static String[] names = {"Valera", "Petya", "Taras", "Prokop"};

    public static String generateName(){
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
}