package homework.JD1.task6;

public class Test6 {
    public static void main(String[] args) {
        int number = 73491202;
        int[] backNumber = new int[10];
        int counter = 0;
        while (number > 0) {
            backNumber[counter] = number % 10;
            counter++;
            number=number/10;
        }
        for (int j = 0; j < counter; j++) {
            System.out.print(backNumber[j]);
        }

    }
}
