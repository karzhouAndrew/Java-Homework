package homework.JD1.task_brackets;

public class Test {
    public static void main(String[] args) {
        String str = "        Тестовая с(()т()ро(ка )с  (нес))к((()))олькими  пробелами  ";
        int counter = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '(') {
                counter++;
            }
            if (symbol == ')') {
                counter--;
            }
        }
        if (counter == 0) {
            System.out.println("Скобки расставлены правильно");
        } else System.out.println("Скобки расставлены неправильно");
    }
}
