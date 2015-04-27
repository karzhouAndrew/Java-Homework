package workbook.lab26;

import java.util.Random;

public class GeneratorSurName {
    private String surName;

    public GeneratorSurName() {
        surName = generatorSurName();
    }

    private String generatorSurName() {
        MansSurName[] mansSurNames = MansSurName.values();
        Random random = new Random();
        int i = random.nextInt(mansSurNames.length);
        String nameString = (mansSurNames[i].toString());
        mansSurNames = null;
        return parserToString(nameString);
    }

    public String parserToString(String nameString) {
        String string = nameString.substring(1).toLowerCase();
        String string2 = nameString.substring(0, 1);
        return string2 + string;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
