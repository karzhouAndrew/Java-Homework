package classes.lab2;

/*
Задание #12 Блинова по строкам.
Из текста удалить все слова заданной длинны, начинающиеся на согласную букву.
Я задал длинну слова 6 букв.
 */
public class Epam {
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
        String[] words = str.split(" +");
        String compare;
        int quantityLetters = 6;
        char[] array = {'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Ж', 'ж', 'З', 'з', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'П', 'п', 'Р', 'р', 'С', 'c', 'Т', 'т', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ', 'щ'};

        StringBuilder builder = new StringBuilder();
        here:
        for (int i = 0; i < words.length; i++) {
            compare = words[i];
            if (compare.length() == quantityLetters && compare.charAt(quantityLetters - 1) != '.' && compare.charAt(quantityLetters - 1) != ',') {
                for (int j = 0; j < array.length; j++) {
                    if (compare.charAt(0) == array[j]) {
                        continue here;
                    }
                }
            }
            builder.append(words[i]).append(" ");
        }
        System.out.println(builder);
    }
}
