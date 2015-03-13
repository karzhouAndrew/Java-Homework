package lab16;

/*
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать их количество.
 */
public class NumOfPunctMarks {
    public static void main(String[] args) {
        String str = "Таким образом, массив - это тип данных, позволяющий хранить в одной переменной сразу несколько значений";
        int n = 0;
        int m = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',') {
                n++;
            } else if (symbol == '-') {
                m++;
            }
        }
        System.out.println("в строке есть " + n + " запятых");
        System.out.println("в строке есть " + m + " тире");
    }
}
