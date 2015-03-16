package workbook.lab6;

/**
 * Created by Asus on 21.02.2015.
 */
public class Six {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 1000000);
        int residue, digit;
        int searchingOfResidue = 10;
        int searchingDigit = 1;
        System.out.println("Первоначальное число = " + n);
        System.out.print("Число выписанное в обратном порядке = ");
        while (n > 10) {
            residue = n % searchingOfResidue;
            if (residue > 0) {
                n = n - residue;
                digit = residue / searchingDigit;
                searchingDigit = searchingDigit * 10;
                searchingOfResidue = searchingOfResidue * 10;
                System.out.print(digit);
            } else {
                System.out.print(0);
                searchingDigit = searchingDigit * 10;
                searchingOfResidue = searchingOfResidue * 10;
                n = n - residue;
            }
        }
    }
}
