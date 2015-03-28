package homework.JD1.task9;

public class Test9 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 20);
        int max = number;
        System.out.print(number + " ");

        while (number != 0) {
            number = (int) (Math.random() * 20);
            System.out.print(number + " ");
            if (max < number) {
                max = number;
            }
        }

        System.out.println();
        System.out.print("Максимальное: " + max);
    }
}
