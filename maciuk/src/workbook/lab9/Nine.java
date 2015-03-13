package workbook.lab9;

/**
 * Created by Asus on 21.02.2015.
 */
public class Nine {
    public static void main(String[] args) {
        int quantityNumbers = 0;
        int largestNumber = 0;
        int randomNumber = (int) (Math.random() * 20);
        while (randomNumber != 0) {
            if (randomNumber > largestNumber) {
                largestNumber = randomNumber;
            }
            quantityNumbers++;
            randomNumber = (int) (Math.random() * 20);
        }
        if (quantityNumbers != 0) {
            System.out.println("Наибольшее число = " + largestNumber);
        } else {
            System.out.println("случайное число = 0");
        }
    }
}
