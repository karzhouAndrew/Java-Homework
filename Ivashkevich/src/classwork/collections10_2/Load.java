package classwork.collections10_2;

/**
 * Created by Leonid on 09.03.2015.
 */
public class Load {
    public static void main(String[] args) {
        String[]array = new String[15];
        array[0]="5";
        array[1]="2";
        array[2]="3";
        array[3]="4";
        array[4]="5";
        array[5]="d";
        array[6]="f";
        array[7]="b";
        array[8]="a";
        array[9]="w";
        array[10]="q";
        array[11]="l";
        array[12]="n";
        array[13]="h";
        array[14]="g";
        IteratorArray iteratorArray = new IteratorArray(array);
        while(iteratorArray.hasNext()){
            System.out.println(iteratorArray.next());
        }

    }
}
