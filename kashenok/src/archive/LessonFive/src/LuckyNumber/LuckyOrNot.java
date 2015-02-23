package LuckyNumber;

public class LuckyOrNot {



    public LuckyOrNot(int number, int firstDigit, int secondDigit, int thirdDigit){

        if (firstDigit == secondDigit && secondDigit == thirdDigit) {
            System.out.print("Введенное число: " + number + " является СЧАСТЛИВЫМ!");
        } else if (thirdDigit == secondDigit + 1 && secondDigit == firstDigit + 1) {
            System.out.print("Введенное число: " + number + " является СЧАСТЛИВЫМ!");
        } else if (number == 781 || number == 302 || number == 409 || number == 941) {
            System.out.print("Введенное число: " + number + " является МАГИЧЕСКИМ!");
        } else {
            System.out.print("Введенное число: " + number + " является НЕСЧАСТЛИВЫМ!");
        }

    }
}
