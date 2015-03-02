package classes.lab3;

/*
Задание #11 Блинова по строкам.
В каждом предложении текста исключить подстроку максимальной длинны, начинающуюся и заканчивающуюся заданными символоми.
Результат получился не совсем верный, удалилась не только наибольшая подстрока в каждом предложении
начитающаеся и заканчивающаеся символом  'o', но и все символы 'o' и '.' .
 */
public class Epam1 {
    public static void main(String[] args) {
        String str = "Экран видеомагнитофона от глас пользователя должен находиться \n" +
                "на оптимальном расстоянии 600-700 мм, но не ближе 500 мм с учетом \n" +
                "размеров алфавитно-цифровых знаков и символов. \n" +
                "   В помещениях ежедневно должна проводиться влажная уборка. \n" +
                "   Помещения должны быть оснащены аптечкой первой помощи и \n" +
                "углекислотными огнетушителями. \n" +
                "   Высота рабочей поверхности стола для взрослых пользователей \n" +
                "должна регулироваться в приделах 680-800 мм. При отсутствии такой \n" +
                "возможности высота рабочей поверхности стола должна состовлять 725 мм. ";
        String[] sentence = str.split("[.]");
        String text;
        String subText1;
        String subText2;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < sentence.length; i++) {
            text = sentence[i];
            String[] substring = text.split("о");
            int n = 0;
            for (int j = 0; j < substring.length; j++) {
                subText1 = substring[n];
                subText2 = substring[j];
                if (subText1.length() < subText2.length()) {
                    n = j;
                }

            }
            for (int k = 0; k < substring.length; k++) {
                if (k != n) {
                    builder.append(substring[k]).append(" ");
                }
            }
        }
        System.out.println(builder);
    }
}
