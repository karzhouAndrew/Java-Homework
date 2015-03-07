package training.argumentTransaction.byValue;


public class ValueTransactionTest {
    public static void main(String[] args) {
        ValueTransaction object = new ValueTransaction();
        int a=5;
        int b=5;
        System.out.println("b = " + b+ "\n"+"a = " + a);

        object.meth(a,b);
        System.out.println("b = " + b+ "\n"+"a = " + a);


    }



}
