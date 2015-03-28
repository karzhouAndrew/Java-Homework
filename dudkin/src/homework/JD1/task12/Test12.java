package homework.JD1.task12;

public class Test12 {
    public static void main(String[] args) {
        int[] marks = new int[20];
        int maxMark;
        for (maxMark = 0; maxMark < marks.length; ++maxMark) {
            marks[maxMark] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[maxMark] + " ");
        }
        maxMark = marks[0];
        int index = 0;
        for (int i = 0; i < marks.length; ++i) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                index = i + 1;
            }
        }
        System.out.println();
        System.out.println("Номер максимального числа: " + index);
    }
}
