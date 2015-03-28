package homework.JD1.task18;

public class Test18 {
    public static void main(String[] args) {
        String str = "        Тестовая строка с  несколькими  пробелами  ";
        char[] str1 = new char[20];
        int counter = 0;
        char symbol;
        char nextSymbol;
        for (int i = 0; i < str.length() - 1; i++) {
            symbol = str.charAt(i);
            nextSymbol = str.charAt(i + 1);
            if (symbol != ' ' && nextSymbol == ' ') {
                str1[counter] = symbol;
                counter++;
            }
        }
        System.out.println(str1);
    }
}
