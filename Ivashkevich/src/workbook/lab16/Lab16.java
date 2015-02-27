package workbook.lab16;

/*
 * Ввести строку и подсчитать количество знаков препинания в ней.
 */
public class Lab16 {
    public static void main(String[] args) {
        String text = "Тестовая, строка, с !несколькими,, за?пятыми";
        int n = 0;
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if (symbol == ',') {
                n++;
            }
            if (symbol == '.') {
                n++;
            }
            if (symbol == '!') {
                n++;
            }
            if (symbol == '?') {
                n++;
            }
            if (symbol == ';') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знаков препинания");

    }
}
