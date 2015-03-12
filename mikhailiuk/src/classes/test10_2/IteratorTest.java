package classes.test10_2;

/**
 * Created by Natashka on 04.03.2015.
 */
public class IteratorTest {
    public static void main(String[] args) {
        String[] strArr = new String[5];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "String" + i;
        }
       StringArrayIterator stringArrayIterator=new StringArrayIterator(strArr);
        while (stringArrayIterator.hasNext()){
            System.out.println(stringArrayIterator.next());
        }
        System.out.println("__________");
       stringArrayIterator.setCursor(0);
        while (stringArrayIterator.hasNext()){
            if (stringArrayIterator.next().equals("String3")){
                stringArrayIterator.remove();
            }
        }
        stringArrayIterator.setCursor(0);
        while (stringArrayIterator.hasNext()){
            System.out.println(stringArrayIterator.next());
        }
    }
}
