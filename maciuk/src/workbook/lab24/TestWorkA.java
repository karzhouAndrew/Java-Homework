package workbook.lab24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Asus on 21.02.2015.
 */
public class TestWorkA {
    public static void main(String[] args) {
        int n = 0;
        String str = "  Экран видеомагнитофона от глас пользователя должен находиться\n" +
                "на оптимальном расстоянии 600-700 мм, но не ближе 500 мм с учетом\n" +
                "размеров алфавитно-цифровых знаков и символов.\n" +
                "   В помещениях ежедневно должна проводиться влажная уборка.\n" +
                "   Помещения должны быть оснащены аптечкой первой помощи и\n" +
                "углекислотными огнетушителями.\n" +
                "   Высота рабочей поверхности стола для взрослых пользователей\n" +
                "должна регулироваться в приделах 680-800 мм; при отсутствии такой\n" +
                "возможности высота рабочей поверхности стола должна состовлять 725 мм.\n";
        Pattern pattern = Pattern.compile("[аоуеёиыюя]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            n++;
        }
        System.out.println("Гласных букв в тексте " + n);
        int t = 0;
        Pattern pattern1 = Pattern.compile("[а-яА-Я]");
        Matcher matcher1 = pattern1.matcher(str);
        while (matcher1.find()) {
            t++;
        }
        int d = t - n;
        System.out.println("Согласных букв в тексте " + d);
    }
}
