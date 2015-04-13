package workbook2.lab2;

import java.util.Locale;

/**
 * Created by vasilevich on 28.03.2015.
 */
public enum TranslatorList {
    ENGLISH {
        public Locale getLocale() {
            return Locale.ENGLISH;
        }
    },
    BELARUS {
        public Locale getLocale() {
            return new Locale("be", "BY");
        }
    },
    RUSSIAN {
        public Locale getLocale() {
            return new Locale("ru", "RU");
        }
    };

    public abstract Locale getLocale();
}
