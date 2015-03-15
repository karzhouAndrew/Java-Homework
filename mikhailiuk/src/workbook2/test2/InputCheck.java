package workbook2.test2;

import java.util.Locale;

/**
 * Created by Natashka on 15.03.2015.
 */
public class InputCheck {
    public Locale localeCheck(String language, String country) {
        Locale locale = null;
        if (!language.equals("") && !country.equals("")) {
            if (language.equals("en") && country.equals("GB") | language.equals("ru") && country.equals("RU") | language.equals("be") && country.equals("BY")) {
                locale = new Locale(language, country);
            }
        } else {
            locale = new Locale("en", "GB");
        }
        return locale;
    }
}
