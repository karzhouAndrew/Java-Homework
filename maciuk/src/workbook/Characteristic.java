package workbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Asus on 21.02.2015.
 */

public class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Создаем Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("Завершаем Characteristic " + s);
    }
}

