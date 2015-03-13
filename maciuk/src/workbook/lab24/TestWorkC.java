package workbook.lab24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Asus on 21.02.2015.
 */

public class TestWorkC {
    public static void main(String[] args) {
        int n = 0;
        int t = 0;
        int d = 0;
        String str = "  Экран видеомагнитофона от глас пользователя должен находиться\n" +
                "на оптимальном расстоянии 600-700 мм, но не ближе 500 мм с учетом\n" +
                "размеров алфавитно-цифровых знаков и символов.\n" +
                "   В помещениях ежедневно должна проводиться влажная уборка.\n" +
                "   Помещения должны быть оснащены аптечкой первой помощи и\n" +
                "углекислотными огнетушителями.\n" +
                "   Высота рабочей поверхности стола для взрослых пользователей\n" +
                "должна регулироваться в приделах 680-800 мм. При отсутствии такой\n" +
                "возможности высота рабочей поверхности стола должна состовлять 725 мм.\n";
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            n++;
        }
        Pattern pattern1 = Pattern.compile("\n");
        Matcher matcher1 = pattern1.matcher(str);
        while (matcher1.find()) {
            t++;
        }
        d = n + t;
        System.out.println("количество пробелов и обзацев в тексте " + d);
    }
}

