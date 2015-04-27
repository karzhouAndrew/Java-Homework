package workbook.lab26;

import java.util.Random;

public class GeneratorName {
    private String name;

    public GeneratorName() {
        name = generatorName();
    }

    public String generatorName() {
        MansName[] mansNames = MansName.values();
        Random random = new Random();
        int i = random.nextInt(mansNames.length);
        String nameString = (mansNames[i].toString());
        mansNames = null;
        return parserToString(nameString);
    }

    public String parserToString(String nameString) {
        String string = nameString.substring(1).toLowerCase();
        String string2 = nameString.substring(0, 1);
        return string2 + string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
