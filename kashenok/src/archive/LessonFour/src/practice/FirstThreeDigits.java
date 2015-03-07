package practice;

import javax.swing.*;

public class FirstThreeDigits {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("Введите желаемое число");
        double num = Double.parseDouble(number);

        int finalnum = Integer.parseInt(String.valueOf(num*1000));
        int temp = finalnum%1000;
        int firstDigit = temp / 100;
        int thirdDigit = temp % 10;
        int secondDigit = (temp - thirdDigit)/10 - firstDigit * 10;

        int sum = firstDigit+secondDigit+thirdDigit;
        System.out.println("Сумма последних трех цифр числа: " + finalnum + " равна: " + sum);

    }
}
