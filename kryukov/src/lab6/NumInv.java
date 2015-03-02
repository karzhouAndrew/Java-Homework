package lab6;

/*
Определить число, полученное выписыванием в обратном порядке цефр любого натурального числа n.
 */
public class NumInv {
    public static void main(String[] args) {
        int n = 12387;
        int inv;
        System.out.print("Искомое число = ");
        while(n > 0) {
            inv = n % 10;
            System.out.print(inv);
            n /= 10;
        }
    }
}
